package PassingClassesThrough;

/**
 * Created by gfox on 24/10/2014.
 */
public class Test {

    public static void main(String[] args) {
        D d = new D();
        d.testMethod(new B());
    }

}
class A{

    public void sayHello(){
        System.out.println("Hello");
    }
}
class B extends A implements C{

}
interface C{

}
class D{
    public void testMethod(A a){
      a.sayHello();
    }
}