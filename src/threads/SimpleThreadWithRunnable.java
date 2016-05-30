package threads;

/**
 * Created by gfox on 29/04/2016.
 */
public class SimpleThreadWithRunnable {

    public static void main(String[] args) {

        Counter c = new Counter();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                c.add(10);
            }
        });
        t.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.add(20);
            }
        });
        t1.start();
    }
}
