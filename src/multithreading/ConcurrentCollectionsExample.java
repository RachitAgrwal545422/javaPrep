package multithreading;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class ConcurrentCollectionsExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(10);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(12);

        DelayQueue<Delayed> delayQueue = new DelayQueue<>();
        delayQueue.offer(new Delayed() {
            @Override
            public long getDelay(java.util.concurrent.TimeUnit unit) {
                return 0;
            }

            @Override
            public int compareTo(Delayed o) {
                return 0;
            }
        });

    }
}
