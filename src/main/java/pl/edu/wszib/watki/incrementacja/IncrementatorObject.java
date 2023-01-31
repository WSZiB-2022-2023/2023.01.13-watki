package pl.edu.wszib.watki.incrementacja;

public class IncrementatorObject {
    public synchronized void increment() {
        App.counter++;
    }
}
