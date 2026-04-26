package javaCollections;

import java.util.Map;

public class ImmutableMapExample {
    public static void main(String[] args) {
        //ImmutableMap is a type of Map that cannot be modified after it is created. Once an ImmutableMap is created, you cannot add, remove, or change any of its key-value pairs. This makes it a useful data structure for situations where you want to ensure that the contents of the map remain constant and cannot be accidentally modified.

        //In Java, you can create an ImmutableMap using the Collections.unmodifiableMap() method or by using third-party libraries like Guava's ImmutableMap.

        //Using Collections.unmodifiableMap() or using Map.of() etc

        Map<String, String> immutableMap = Map.of("key1", "value1", "key2", "value2");

        //immutableMap.put("key3", "value3"); // This will throw UnsupportedOperationException
    }
}
