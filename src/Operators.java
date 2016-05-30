/**
 * Created by gfox on 01/09/2014.
 */
public class Operators {

    public static void main(String[] args) {
      /*  Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;

        System.out.println(i1==i3);
        System.out.println(i1.equals(i2));*/
        System.out.println(parseFloat("0x.1"));


    }

   public static float parseFloat(String s){
        float f = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input " + s);
            f = Float.NaN ;
            return f;
        }
        finally { System.out.println("finally");  }
        //return f ;
    }

    }
class Widget{
    static int MAX;     //1


    static {MAX = 111;}
      // 2
    Widget(){

    }
    Widget(int k){

    }
}

