
import java.util.concurrent.*;

class ThreadPool {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            final int id = i;

            pool.submit(() -> {
                System.out.println("Task " + id + " running on " +
                                   Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            });
        }

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("All tasks completed");
    }
}
