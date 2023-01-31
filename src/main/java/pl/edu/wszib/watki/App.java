package pl.edu.wszib.watki;

public class App {
    public static void main(String[] args) {
        /*Watek w1 = new Watek(1);
        Watek w2 = new Watek(2);
        Watek w3 = new Watek(3);
        Watek w4 = new Watek(4);

        w1.start();
        w2.start();
        w3.start();
        w4.start();*/

        Thread t = new Thread(new LepszyWatek());
        t.start();
    }
}
