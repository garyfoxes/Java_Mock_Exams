/**
 * Created by gfox on 21/04/2016.
 */
public class TestAbstract {

    public static void main(String[] args) {
        A11 test = new A1();
        System.out.println(test.getName());
        System.out.println(test.getNameNonAbstract());
    }
}

abstract class A11 {

    abstract String getName();

    public String getNameNonAbstract() {
        return "Hello John";
    }
}

class A1 extends A11 {

    @Override
    public String getName() {
        return "Hello Bill";
    }

}

