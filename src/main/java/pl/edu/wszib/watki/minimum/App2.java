package pl.edu.wszib.watki.minimum;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static final List<Integer> partialMins = new ArrayList<>();
    public static void main(String[] args) {
        int[] tab = new int[1000000000];
        int threadsNumber = 13;
        long startTime = System.currentTimeMillis();

        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i < threadsNumber; i++) {
            threads.add(new Thread(new MinFinder(tab,
                    i * (tab.length/threadsNumber),
                    (i + 1) * (tab.length/threadsNumber))));
            threads.get(i).start();
        }

        try {
            for(Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {}

        int globalMin = partialMins.get(0);
        for(int partialMin : partialMins) {
            if(partialMin < globalMin) {
                globalMin = partialMin;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println(globalMin);
        System.out.println(endTime - startTime);
    }
}
