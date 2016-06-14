package inheritancebrainer;

/**
 * Created by gfox on 26/08/2014.
 */
public class TestClass {
    public static void main(String[] args){
        A a = new B();
        B b = new C();

        b = (C) a;


        a.print();
        boolean result = false;
        System.out.println(!result);
        result = true;
        System.out.println(!result);
    }

}
class A{
    static final int v;
    static{
        v = 11;
    }

    A() {

        print();


    }
   void print() { System.out.println("A"); }
}
class B extends A{
    int i =   Math.round(3.5f);
    public B(){

    }


   public void print() { System.out.println(i); }
}
class C extends B{

}
