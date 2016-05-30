package exceptions;

/**
 * Created by gfox on 29/08/2014.
 */
public class Test {

    public static void main(String args[]){
        A a = new A();
        a.doB(args.length>0); // 5
    }

}

class A {

    public void doA(int k) {  // 0
        for (int i = 0; i < 10; i++) {
            if (i == k) throw new NullPointerException("Index of k is " + i); // 1
        }
    }

    public void doB(boolean f) { // 2
        if (f) {
            doA(15); // 3
        } else return;
    }
}