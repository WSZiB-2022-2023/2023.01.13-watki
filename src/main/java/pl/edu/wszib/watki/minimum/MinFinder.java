package pl.edu.wszib.watki.minimum;

import java.util.Random;

public class MinFinder implements Runnable {

    int[] tab;
    int startIndex;
    int endIndex;

    public MinFinder(int[] tab, int startIndex, int endIndex) {
        this.tab = tab;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = this.startIndex; i < this.endIndex; i++) {
            tab[i] = random.nextInt(1000000000);
        }

        int min = tab[this.startIndex];
        for(int i = this.startIndex; i < this.endIndex; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }

        synchronized (App2.partialMins) {
            App2.partialMins.add(min);
        }
    }
}
