package lab_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // create a thread pool with fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // submit a task to the pool
        executor.submit(new Task());

        // shutdown the executor when done using it
        executor.shutdown();
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Task executed in thread: " + Thread.currentThread().getName());
        }
    }
}