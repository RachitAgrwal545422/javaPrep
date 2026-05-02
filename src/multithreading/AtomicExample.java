package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicExample {
    static int a;
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger(0);
        count.incrementAndGet(); // Atomically increments by one and returns the new value
        System.out.println(count);


//        a = 0;
//        AtomicInteger atomicA = new AtomicInteger(0);
//        AtomicReference<Integer> atomicA = new AtomicReference<>(0);
        AtomicStampedReference<Integer> atomicA = new AtomicStampedReference<>(0, 0); // Initializes the reference with an initial value and a stamp
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                atomicA.compareAndSet(0, 1,0,1); // Atomically sets the value to 0 if the current value is 10000
            }
        };
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(task, executor);
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(task, executor);
        CompletableFuture.allOf(future1, future2).join();
        executor.shutdown();
        System.out.println("Final value of a: " + atomicA.getReference());
        System.out.println("Final value of a: " + atomicA.getStamp());



    }
}
