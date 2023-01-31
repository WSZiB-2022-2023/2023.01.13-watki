package pl.edu.wszib.watki.incrementacja;

import java.util.concurrent.atomic.AtomicInteger;

public class App {

    public static int counter = 0;
    public static final Object lock = new Object();
    public static void main(String[] args) {
        IncrementatorObject incrementatorObject = new IncrementatorObject();
        Thread t1 = new Thread(new Incrementator(incrementatorObject));
        Thread t2 = new Thread(new Incrementator(incrementatorObject));
        Thread t3 = new Thread(new Incrementator(incrementatorObject));
        Thread t4 = new Thread(new Incrementator(incrementatorObject));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {}

        System.out.println(counter);
    }
}
