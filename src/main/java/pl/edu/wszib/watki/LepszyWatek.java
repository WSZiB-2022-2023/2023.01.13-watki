package pl.edu.wszib.watki;

public class LepszyWatek implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Watek lepszy i: " + i);
        }
    }
}
