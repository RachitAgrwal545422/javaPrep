package javaCollections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        //Concurrent Linked Qeueue provides us lock free thread safe queue based on linked nodes
        //It is an unbounded thread-safe queue based on linked nodes. It is part of the java.util.concurrent package and is designed to handle concurrent access by multiple threads without the need for external synchronization.
        // The ConcurrentLinkedQueue class implements the Queue interface and provides methods for adding, removing, and inspecting elements in the queue.
        // It is a non-blocking queue, which means that it does not blocks the thread if element is not present just as blocking queues
        //Uses Similar algorithm like Concurrent HashMap
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        concurrentLinkedQueue.offer("a");
        concurrentLinkedQueue.offer("b");
        concurrentLinkedQueue.offer("c");

    }
}
