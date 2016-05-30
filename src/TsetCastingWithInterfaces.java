/**
 * Created by gfox on 06/11/2014.
 */
public class TsetCastingWithInterfaces {

    public static void main(String[] args) {
        SuperClass s = new SubClass("Hello");

        System.out.println(((SubClass) s).getAge());
    }
}

class SuperClass {

    public String name;

    public SuperClass(String name) {
        this.name = "Jim";
    }

    public String getName() {
        return "Gerry";
    }
}

class SubClass extends SuperClass {

    public SubClass(String name) {
        super(name);
    }

    public String getAge() {
        return "31";
    }
}