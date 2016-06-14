package instance_of;

/**
 * Created by gfox on 26/08/2014.
 */
public class InstanceOf {

        public static void main(String args[]){
            B b = new C();
            A a = b;

            //is true because a points to a C() object which contains
            if (a instanceof A) System.out.println("instance_of.A");
            if (a instanceof B) System.out.println("instance_of.B");
            if (a instanceof C) System.out.println("instance_of.C");
            if (a instanceof D) System.out.println("instance_of.D");
        }
    }
    class A { }
    class B extends A { }
    class C extends B { }
    class D extends C { }

