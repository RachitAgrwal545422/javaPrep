package javaCollections;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {
    public static void main(String[] args) {
        //Same as Concurrent Linked Queue but this is Doubly Ended
        //Thread Safe
        //Uses Doubly Linked List
        //Uses same algorithm as concurrent hash map and concurrent linked queue
        //non blocking
        ConcurrentLinkedDeque<String> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        concurrentLinkedDeque.offer("a");
        concurrentLinkedDeque.offer("b");
        concurrentLinkedDeque.offer("c");
    }
}
