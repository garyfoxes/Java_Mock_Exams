package regularexpressionscustomannotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by gfox on 19/05/2016.
 */
public class RegularExpressionsTest {

    static List<InvalidField> invalidFields = new ArrayList<>();

    /**
     * character class[a e i o u] this matches any vowels in an expression
     * wildcard character J. matches any string which starts with J
     * quantifiers +(match one or more) e.g Ja+
     * *(match zero or more) e.g Ja*
     * \w(word)
     * \d(digit)
     * \s(space)
     * <p>
     * Greedy vs Lazy quantifier(Greedy consumes as much as possible, lazy(?) will match as few as possible)
     * * @param args
     */
    public static void main(String[] args) throws IllegalAccessException, ValidationFailedException {
        //http://www.myezapp.com/apps/dev/regexp/show.ws to test regular expressions
        //http://regexr.com/ (has cheatsheet also to test out expressions)

        System.out.println("################################ LOOK AHEAD POSITIVE/NEGATIVE ##################################");
        String words = "foobarbarfoo";
        String positiveLookAhead = "bar(?=bar)";// finds the Ist bar('bar which has a bar before it')
        //String negativeLookAhead = "bar(?!bar)"; //finds the 2nd bar ("bar" which does not have "bar" after it)
        Pattern pattern = Pattern.compile(positiveLookAhead);
        Matcher matcher = pattern.matcher(words);
        while (matcher.find()) {
            System.out.println(matcher.group() + " at position " + matcher.start());
        }

        //String words = "now is the time 90 or now is not the time 100";
        //String patt = "^ow.+[\\s]+"; //begins with ow followed by any character one or more times followed by any whitespace

     /*   String words = "Mike McMillian Terri McMillen Allison McMillin ";
        String patt = "McM.*? ";// starts with McM followed by any character xero or more times folled by whitespace(lazy quantifier used to consume as little as possible)

        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(words);
        System.out.println(words);
        words = matcher.replaceAll("McMillian ");
        System.out.println(words);
*/
        //System.out.println("########################### Find Text Between HTML Tags##################################");

     /*   String words = "<em>Hello World</em>";
        String patt = "(<.+?>)(.+)(<.+?>)";

        Pattern pattern = Pattern.compile(patt);
        Matcher match = pattern.matcher(words);
        while (match.find()) {
            System.out.println("Match: " + match.group(2));
        }
*/
    /*    System.out.println("####################### WORD CHARACTERS ###############################");
        while (match.find()) {
            System.out.println("Found match at position: " + match.start());
            System.out.println("Match: " + match.group());
        }
        System.out.println("####################### DIGITS ###############################");
        patt = "\\d+";
        pattern = Pattern.compile(patt);
        match = pattern.matcher(words);
        while (match.find()) {
            System.out.println("Found match at position: " + match.start());
            System.out.println("Match: " + match.group());
        }

        System.out.println("####################### SPACES ###############################");
        int count = 0;
        patt = "\\s+";
        pattern = Pattern.compile(patt);
        match = pattern.matcher(words);
        while (match.find()) {
            count++;
        }
        System.out.println("Number of spaces found:" + count);*/

        //RegExObject test = new RegExObject("thisssssss");
    }
}

class RegExObject {

    @RegExAnnotation(RegExLibrary.message)
    private String name;
    @MandatoryAnnotation
    private int age;

    public RegExObject(String name, int age) throws ValidationFailedException, IllegalAccessException {
        this.name = name;
        this.age = age;
        validate(this);
    }

    public RegExObject(String name) throws ValidationFailedException, IllegalAccessException {
        this.name = name;
        validate(this);
    }

    private static void validate(RegExObject test) throws IllegalAccessException, ValidationFailedException {
        Field[] fields = test.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            for (Annotation annotation : field.getDeclaredAnnotations()) {
                if (annotation.annotationType().equals(RegExAnnotation.class)) {
                    validateRegEx(test, field);
                } else if (annotation.annotationType().equals(MandatoryAnnotation.class)) {
                    if (null == field.get(test)) {
                        RegularExpressionsTest.invalidFields.add(new InvalidField(field.getName(), "Field Is Mandatory But Is Not Filled"));
                    }
                }
            }
        }
        if (!RegularExpressionsTest.invalidFields.isEmpty()) {
            throw new ValidationFailedException("Basic Field Validation For " + test.getClass().getSimpleName(), RegularExpressionsTest.invalidFields);
        }
    }

    private static void validateRegEx(RegExObject test, Field field) throws IllegalAccessException {
        String value = (String) field.get(test);
        RegExAnnotation regExAnnotation = field.getAnnotation(RegExAnnotation.class);
        Pattern pattern1 = Pattern.compile(regExAnnotation.value());
        if (!pattern1.matcher(value).matches()) {
            RegularExpressionsTest.invalidFields.add(new InvalidField(field.getName(), "Field Does Meet The Required Regular Expression"));
        }
    }
}

class InvalidField {

    private String field;
    private String message;

    public InvalidField(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public String getMessage() {
        return message;
    }
}

