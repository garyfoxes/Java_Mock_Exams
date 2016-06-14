import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by gfox on 15/10/2014.
 */
public class StringBuilderExercise {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
        c.add(Calendar.YEAR,10);
        System.out.println(sdf.format(c.getTime()));
       /* StringBuilder sb = new StringBuilder("Hello");
        sb.insert(5,"there"); //count characters from 0 up until the length of the string e.g hello is of length 5
        System.out.println(sb.toString());*/
      /*  String newString = sb.substring(3, 5);  //start(inclusive), end(exclusive)
        System.out.println(sb.lastIndexOf("l",3)); //works backwords from the position stated and returns an integer
        System.out.println(newString);
        System.out.println(sb.toString());*/
        // String to be scanned to find the pattern.
      /*  String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        } else {
            System.out.println("NO MATCH");
        }*/
    }
}
