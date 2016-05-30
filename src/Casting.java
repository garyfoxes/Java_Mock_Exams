/**
 * Created by gfox on 03/11/2014.
 */
public class Casting {

    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();
        B b = new B();
        b = (B) a1;// is fine because at run time a1 points to a B object, b = a1 will throw up a compilation error as at compile time a1 is an A reference variable
        b = (B) a; // will throw up a class cast exception



    }
}
    class A {

    }

    class B extends A {

    }

    class C {

    }
interface D{

}
