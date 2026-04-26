package javaCollections;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetExample {
    enum Color {
        RED,
        BLUE
    }
    public static void main(String[] args) {
        //A Set is a collection that cannot contain duplicate elements. It is an unordered collection, meaning that the elements are not stored in any particular order. The Set interface is part of the Java Collections Framework and is implemented by various classes such as HashSet, TreeSet, and LinkedHashSet.

        //The main features of a Set include:
        //1. No duplicate elements: A Set does not allow duplicate elements. If you try to add a duplicate element to a Set, it will simply ignore the new element and keep the existing one.
        //2. Unordered collection: The elements in a Set are not stored in any particular order. This means that the order of the elements may change over time as you add or remove elements from the Set.
        //3. Null values: A Set can contain null values, but only one null value is allowed since duplicates are not allowed.
        //4. Different implementations: There are different implementations of the Set interface, each with its own characteristics. For example, HashSet is based on a hash table and provides constant-time performance for basic operations like add, remove, and contains, while TreeSet is based on a red-black tree and provides sorted order for its elements.

        Set<String> set = new HashSet<>(20, 0.02f);//normal set
        set.add("A");
        set.add("B");
        System.out.println(set); // Output: [A, B]

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(20, 0.02f);//it maintains insertion order
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        System.out.println(linkedHashSet);// Output: [A, B]

        TreeSet<String> treeSet = new TreeSet<>((Comparator.comparingInt(String::length)));//it maintains natural order
        treeSet.add("B");
        treeSet.add("A");
        System.out.println(treeSet);// Output: [A, B]

        EnumSet<EnumMapExample.Day> enumSet = EnumSet.allOf(EnumMapExample.Day.class);//it is a specialized Set implementation for use with enum types. It is a high-performance Set implementation that is optimized for use with enum types, and it provides a compact and efficient way to store and manipulate sets of enum constants.
        System.out.println(enumSet);

        ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<>((Comparator.comparingInt(String::length)));//It is a thread-safe variant of TreeSet that provides concurrent access to its elements. It is implemented as a skip list, which is a data structure that allows for efficient search, insertion, and deletion operations while maintaining a sorted order of the keys. It is designed to handle concurrent modifications by multiple threads without the need for external synchronization, making it suitable for use in multi-threaded environments. It provides better performance than other concurrent set implementations, such as CopyOnWriteArraySet, when there are a large number of read operations and a small number of write operations.
        concurrentSkipListSet.add("A");
        concurrentSkipListSet.add("B");
        System.out.println(concurrentSkipListSet);

        Set<String> hashSet = Set.of("A", "B");//it is an immutable set, which means that once it is created, it cannot be modified. Any attempt to modify the set will result in an UnsupportedOperationException being thrown. This can be useful in situations where you want to ensure that a set of data remains constant and cannot be accidentally modified by other parts of your code.
        System.out.println(hashSet);

        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();//It is a thread-safe variant of HashSet that provides concurrent access to its elements. It is implemented as a copy-on-write array, which means that when a modification is made to the set, a new copy of the underlying array is created with the modified elements. This allows for efficient read operations while still providing thread safety for write operations. However, it can be less efficient than other concurrent set implementations, such as ConcurrentSkipListSet, when there are a large number of write operations.
        copyOnWriteArraySet.add("A");
        copyOnWriteArraySet.add("B");
        System.out.println(copyOnWriteArraySet);

    }
}
