/**
 * Created by gfox on 16/10/2014.
 */
public class AutoBoxing {

    public static void main(String[] args) {
        Integer i = new Integer(0);
        int j =  0;
        System.out.println(i instanceof Integer);
        System.out.println(i == j);
        System.out.println(i.equals(j));
        System.out.println(j);

        String s = new String("h");
        String t = "h";
        System.out.println(s == t); //Comparing objects using the == and != compares reference and not values,this returns false. When using <= and >= it autoboxes values


     StringBuilder sb = new StringBuilder("fff");
        StringBuilder sb1 = new StringBuilder("fff");
        System.out.println(sb + " " + sb1);
        System.out.println(sb.equals(sb1));  //Stringbuilder does not implement the equals method, always returns false if the variables do not refer to the same object

        System.out.println(sb == sb1);

          char a = 'a';
        int a1 = a;



    }

}
