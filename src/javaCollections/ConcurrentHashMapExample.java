package javaCollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        //ConcurrentHashMap is a thread-safe variant of HashMap
        //In Java 7 -> It was using a segment based locking approach where each segment was locked when we edit it

        //In Java 8 -> It uses a combination of lock-free techniques and fine-grained locking to achieve better performance and scalability
        //It allows concurrent read and write operations without locking the entire map
        //It uses a technique called "lock striping" to achieve better concurrency
        //It does not allow null keys or null values

        //In this technique locking happens only on resizing or collision.
        //for keys and values, non null values are allowed only
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>(20,0.2f);
    }
}
