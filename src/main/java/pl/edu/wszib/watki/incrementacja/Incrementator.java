package pl.edu.wszib.watki.incrementacja;

public class Incrementator implements Runnable {

    IncrementatorObject incrementatorObject;

    public Incrementator(IncrementatorObject incrementatorObject) {
        this.incrementatorObject = incrementatorObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            incrementatorObject.increment();
            //App.counter.incrementAndGet();
        }
    }

    /*private synchronized void increment() {
        App.counter++;
    }*/
}
