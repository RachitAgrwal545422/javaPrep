package javaCollections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        //PriorityQueue is a data structure that allows you to store elements in a way that the highest priority element is always at the front of the queue. In Java, the PriorityQueue class is part of the java.util package and implements the Queue interface.

        //By default, the PriorityQueue in Java is a min-heap, which means that the element with the lowest value (or highest priority) will be at the front of the queue. You can also create a max-heap by providing a custom comparator.

        PriorityQueue<Integer> pq = new PriorityQueue<>(23,(a,b) -> b-a);

        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        System.out.println(pq); // Output: [8, 2, 5, 1]

        //The element with the highest priority (lowest value) will be at the front of the queue
        System.out.println(pq.peek()); // Output: 8

        //Removing elements from the PriorityQueue
        System.out.println(pq.poll()); // Output: 8 (removes and returns the head of the queue)
        System.out.println(pq); // Output: [5, 2, 1]
    }
}
