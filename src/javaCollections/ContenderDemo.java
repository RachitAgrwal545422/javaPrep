package javaCollections;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class ContenderDemo {
     final static public Integer THREADS = 32;
     final static public Integer ops_per_thread = 1000000;

    public static void main(String[] args) throws InterruptedException {
        AtomicLong atomicA = new AtomicLong(0);
        ExecutorService executor = Executors.newFixedThreadPool(THREADS);

        ArrayList<Runnable> methods1 = new ArrayList<>(THREADS);
        for(int i = 0;i<THREADS;i++){
            methods1.add(()->{
                for(int j = 0;j<ops_per_thread;j++){
                    atomicA.incrementAndGet();
                }
            });
        }

        long start = System.currentTimeMillis();
        CompletableFuture<?>[] futures = methods1.stream()
                .map(task -> CompletableFuture.runAsync(task, executor))
                .toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(futures).join();
        long end = System.currentTimeMillis();

        System.out.println("Final value of a: " + atomicA.get());
        System.out.println("Time taken: " + (end-start) + " ms");

        LongAdder atomicAB = new LongAdder();
        ArrayList<Runnable> methods2 = new ArrayList<>(THREADS);
        for(int i = 0;i<THREADS;i++){
            methods2.add(()->{
                for(int j = 0;j<ops_per_thread;j++){
                    atomicAB.increment();
                }
            });
        }

        long startNew = System.currentTimeMillis();
        CompletableFuture<?>[] futures2 = methods2.stream()
                .map(task -> CompletableFuture.runAsync(task, executor))
                .toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(futures2).join();
        long endNew = System.currentTimeMillis();

        System.out.println("Final value of a: " + atomicA.get());
        System.out.println("Time taken: " + (endNew-startNew) + " ms");
        executor.shutdown();
    }
}
