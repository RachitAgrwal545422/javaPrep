package javaCollections;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBoundedQueueExample {
    public static void main(String[] args) {
        //LinkedBoundedQueue is a thread-safe implementation of a bounded queue that uses a linked list data structure to store its elements. It is part of the java.util.concurrent package and is designed to be used in concurrent programming scenarios where multiple threads need to access a shared queue.

        //A LinkedBoundedQueue has a fixed capacity, which means that it can only hold a certain number of elements at any given time. If the queue is full and a thread tries to add an element, it will block until space becomes available. Similarly, if the queue is empty and a thread tries to remove an element, it will block until an element is added.

        //LinkedBoundedQueue provides methods for adding and removing elements, as well as for checking the size of the queue and whether it is empty or full. It also supports iterating over the elements in the queue using an iterator.
        //similar to array bounded queue but uses a linked list inside
        //max capacity can be INTEGER.MAX_VALUE but it is not recommended as it can lead to OutOfMemoryError if the queue grows too large.
        //We should provide a capacity that is appropriate for our application and the expected workload to avoid performance issues and memory problems.
        LinkedBlockingDeque<String> linkedBoundedQueue = new LinkedBlockingDeque<>(3);
        linkedBoundedQueue.add("Element 1");
        linkedBoundedQueue.add("Element 2");
        linkedBoundedQueue.add("Element 3");



    }
}
