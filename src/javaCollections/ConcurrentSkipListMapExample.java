package javaCollections;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) {
        //It has properties of ConcurrentHashMap and TreeMap
        //It is a thread-safe variant of TreeMap that provides concurrent access to its elements.
        //It is implemented as a skip list, which is a data structure that allows for efficient search, insertion, and deletion operations while maintaining a sorted order of the keys.
        //It is designed to handle concurrent modifications by multiple threads without the need for external synchronization, making it suitable for use in multi-threaded environments.
        //It provides better performance than other concurrent map implementations, such as ConcurrentHashMap, when there are a large number of read operations and a small number of write operations

        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
    }
}
