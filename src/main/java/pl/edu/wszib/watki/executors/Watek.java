package pl.edu.wszib.watki.executors;

public class Watek implements Runnable {

    private int number;

    public Watek(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Watek: " + this.number + " i: " + i);
        }
    }
}
