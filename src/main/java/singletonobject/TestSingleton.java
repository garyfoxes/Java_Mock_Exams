package singletonobject;

/**
 * Created by gfox on 17/05/2016.
 */
public class TestSingleton {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(Singleton.isInstanceCreated());
    }
}

class Singleton {

    private static Singleton singleton = null;
    private static boolean instanceCreated;

    private Singleton() {

    }

    static Singleton getInstance() {
        if (singleton == null) {
            instanceCreated = true;
            return new Singleton();
        }
        return singleton;
    }

    static boolean isInstanceCreated() {
        return instanceCreated;
    }
}