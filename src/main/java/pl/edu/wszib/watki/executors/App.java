package pl.edu.wszib.watki.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        /*ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new Watek(1));
        executorService.submit(new Watek(2));
        executorService.submit(new Watek(3));
        executorService.submit(new Watek(4));

        executorService.shutdown();*/

        /*ExecutorService multiExecutor = Executors.newFixedThreadPool(5);

        multiExecutor.submit(new Watek(1));
        multiExecutor.submit(new Watek(2));
        multiExecutor.submit(new Watek(3));
        multiExecutor.submit(new Watek(4));
        multiExecutor.submit(new Watek(5));
        multiExecutor.submit(new Watek(6));
        multiExecutor.submit(new Watek(7));
        multiExecutor.submit(new Watek(8));

        multiExecutor.shutdown();*/

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);
        scheduledExecutorService.schedule(new Watek(1), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(2), 3, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(3), 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(4), 15, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(5), 20, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(6), 40, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(7), 1, TimeUnit.MINUTES);

        scheduledExecutorService.shutdown();
    }
}
