/**
 * Created by gfox on 26/08/2014.
 */
public class TestClass implements I1, I2 {

    static int i = 10;

    public static void main(String args[]) {
        TestClass tc = new TestClass();

        I1 test = tc;
        test.m1();
        System.out.println(test.VALUE);

           /* int[] a = { 1, 2, 3, 4 };
            int[] b = { 2, 3, 1, 0 };
            System.out.println( a [ (a = b)[3] ] );
            int i=0;
            for (    ; i<5?false:true ;    );*/

    }

    public static void m2() {
        System.out.println("Hello");
    }

    @Override
    public void m1() {
        System.out.println("John");
    }
}

interface I1 {

    int VALUE = 1;

    public void m1();
}

interface I2 {

    int VALUE = 2;

    public void m1();
}

class Dog {

}

class Terrier extends Dog {

}





