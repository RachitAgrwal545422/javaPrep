package javaCollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueExample {
    public static void main(String[] args) {
        //A SynchronousQueue is a blocking queue that does not have any internal capacity. It is designed for handoff scenarios where one thread produces an item and another thread consumes it. When a thread tries to put an item into the queue, it will block until another thread takes the item from the queue. Similarly, when a thread tries to take an item from the queue, it will block until another thread puts an item into the queue.
        //Producer Consumer Problem using SynchronousQueue
        //fair – if true, waiting threads contend in FIFO order for access; otherwise the order is unspecified.
        SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>(true);
        //Producer Thread
        new Thread(() -> {
            try {
                int i = 0;
                while(true) {
                    synchronousQueue.put(i);
                    System.out.println("Produced: " + i);
                    i++;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        //Consumer Thread
        new Thread(() -> {
            try{
                while(true) {
                    int a = synchronousQueue.take();
                    System.out.println("Consumed: " + a);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
