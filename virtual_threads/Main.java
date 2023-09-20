import java.util.concurrent.Executors;
import java.lang.Thread;
import java.time.Duration;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        System.out.println("Virtual Threads Test!");

        int n_tasks = 100;
        int concurrency_limit = 10;

        Semaphore semaphore = new Semaphore(concurrency_limit);

        System.out.printf("Running %s tasks...%n", n_tasks);

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < n_tasks; i++) {
                int f = i;
                executor.submit(() -> {
                    try {
                        semaphore.acquire();
                        Thread.sleep(Duration.ofSeconds(1));
                        System.out.println(f);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted :(");
                    } finally {
                        semaphore.release();
                    }
                });
            }
            System.out.println("Waiting for tasks to complete ...");
            
        } 
        System.out.println("All tasks done!");
    }

}