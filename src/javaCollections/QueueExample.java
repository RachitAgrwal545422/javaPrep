package javaCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        //Queue is a collection that follows the First-In-First-Out (FIFO) principle. It is used to store and manage a sequence of elements where the first element added is the first one to be removed. In Java, the Queue interface is part of the java.util package and provides various methods for adding, removing, and inspecting elements in the queue.
        //Common implementations of the Queue interface include LinkedList, PriorityQueue, and ArrayDeque.


        //Queue Syllabus
        //LinkedList
        //Priority Queue
        //Deque :- LinkedList,Array Dequeue
        //Blocking Queue
        //ArrayBlockingQueue
        //PriorityBlockingQueue
        //LinkedBlockingQueue
        //SynchronousQueue
        //DelayQueue
        //Non Blocking versions of queue :- Concurrent Linked Queue, Concurrent Linked Deque


        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Element 1");
        queue.offer("Element 2");
        queue.add("Element 3");

        // Removing elements from the queue
        String removedElement = queue.remove(); // Removes "Element 1"
        queue.poll(); // Removes "Element 2"
        System.out.println("Removed: " + removedElement);

        // Peeking at the front element without removing it
        String frontElement = queue.peek(); // Returns "Element 2"
        System.out.println("Front Element: " + frontElement);

        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        Queue<String> sizeBlockingqueue = new ArrayBlockingQueue<>( 2,true);//This type of queue blocks the access of the thread if queue size is full
        //fair argument means that blocked threads can access the queue in FIFO order if true else unspecified order
        sizeBlockingqueue.add("Element 1");
        sizeBlockingqueue.add("Element 2");
    }
}
