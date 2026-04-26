package javaCollections;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        //A BlockingQueue is a type of queue that is designed to block the thread that is trying to add an element to the queue when the queue is full, or block the thread that is trying to remove an element from the queue when the queue is empty. This makes it useful for situations where you want to coordinate the actions of multiple threads that are producing and consuming data.

        //In Java, you can use the java.util.concurrent.BlockingQueue interface and its implementations, such as ArrayBlockingQueue, LinkedBlockingQueue, and PriorityBlockingQueue, to create a blocking queue.
        //We can give it a capacity and a fair(If 2 or more threads are waiting then they will get a chance in FIFO order if it is true else no order specified)
        //Example of using ArrayBlockingQueue
        java.util.concurrent.BlockingQueue<Integer> blockingQueue = new java.util.concurrent.ArrayBlockingQueue<>(3,true);

        //Producer thread
        new Thread(() -> {
            try {
                Thread.sleep(1000);//Let the consumer wait untill there is something produced
                blockingQueue.put(1);
                System.out.println("Produced: 1");
                blockingQueue.put(2);
                System.out.println("Produced: 2");
                blockingQueue.put(3); // This will block until there is space in the queue
                System.out.println("Produced: 3");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        //Consumer thread
        new Thread(() -> {
            try {
                System.out.println("Consumed: " + blockingQueue.take());
                System.out.println("Consumed: " + blockingQueue.take());
                System.out.println("Consumed: " + blockingQueue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
