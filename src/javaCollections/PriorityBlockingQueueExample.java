package javaCollections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
    public static void main(String[] args) {
        //PriorityBlockingQueue is a thread-safe variant of the PriorityQueue class in Java. It is implemented as a priority heap and provides concurrent access to its elements. The elements in a PriorityBlockingQueue are ordered according to their natural ordering or by a Comparator provided at the time of creation. The queue allows multiple threads to access and modify it concurrently without the need for external synchronization, making it suitable for use in multi-threaded environments. It is commonly used in scenarios where tasks need to be processed based on their priority, such as in task scheduling or event handling systems.
        //unbounded
        //Similar to linked bounded queue but it is unbounded and it orders the elements based on their priority.
        //It is good practice to give a bound
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(20,Comparator.naturalOrder());
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(4);
        queue.add(5);
        System.out.println(Arrays.toString(queue.toArray()));//Can be any order
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());  // Outputs: 1, 2, 3, 4, 5
        }
    }
}
