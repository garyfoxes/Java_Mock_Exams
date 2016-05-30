package threads;

/**
 * Created by gfox on 28/04/2016.
 */
public class SimpleThread extends Thread {

    private Thread t;
    private String threadName;
    Counter c;
    private int amount;

    public SimpleThread(String name) {
        this.threadName = name;
        System.out.println("Creating " + this.threadName);
    }

    public void run() {
        increment();
    }

    /**
     * Creates new Thread, 'this' is passed in which is an instance of SimpleThread, this class has to implement Runnable.
     * If you extend the Thread class then by default you implement the runnable interface
     */
    public void start(Counter c, int amount) {
        this.c = c;
        this.amount = amount;
        System.out.println("Starting Thread " + this.threadName);
        t = new Thread(this, this.threadName);
        t.start();
    }

    public void increment() {
        this.c.add(this.amount);
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        SimpleThread t = new SimpleThread("Joe");
        t.start(c, 5);
        SimpleThread t1 = new SimpleThread("Bill");
        t1.start(c, 10);
    }
}

class Counter {

    protected long count = 0;

    public void add(long value) {
        //Synchronized key means it only allow 1 thread at a time into the method
        synchronized (this) {
            System.out.println("Running Thread " + Thread.currentThread().getName());
            for (int i = 0; i < value; i++) {
                count++;
                System.out.println(count);
            }
        }
    }
}

