package javaCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        //Deque (Double Ended Queue) is a linear collection that supports element insertion and removal at both ends. It can be used as a stack (LIFO) or as a queue (FIFO) depending on how you use it.

        //LinkedList class can also be used here but that implementation can be a bit slower than ArrayDeque as it uses more memory to store the elements and also has more overhead for maintaining the linked structure. ArrayDeque is a resizable array implementation of the Deque interface and is generally faster than LinkedList for most operations.
        //Faster, lesser memory, both not thread safe, no capacity restrictions, null elements not allowed
        //num Elements is initial capacity
        Deque<String> deque = new ArrayDeque<>(23);

        // Adding elements to the front and back of the deque
        deque.addFirst("Element 1");
        deque.addLast("Element 2");
        deque.addFirst("Element 3");

        System.out.println("Deque after adding elements: " + deque);

        // Removing elements from the front and back of the deque
        String removedFront = deque.removeFirst();
        String removedBack = deque.removeLast();

        System.out.println("Removed from front: " + removedFront);
        System.out.println("Removed from back: " + removedBack);
        System.out.println("Deque after removing elements: " + deque);
    }
}
