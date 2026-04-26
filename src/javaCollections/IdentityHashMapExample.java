package javaCollections;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        //IdentityHashMap is a special implementation of the Map interface in Java that uses reference equality (==) instead of object equality (equals()) for comparing keys and values.
        //This means that in an IdentityHashMap, two keys are considered equal only if they are the same object in memory, not just if they are logically equal.

        //it actually checks identityHashCode(Written inside Object class does not matter Overridden or not) and if it same then actual reference is checked
        java.util.IdentityHashMap<String, String> identityMap = new java.util.IdentityHashMap<>(2);

        String key1 = new String("key");
        String key2 = new String("key");

        identityMap.put(key1, "value1");
        identityMap.put(key2, "value2");

        //in this case hash code of key1 and key2 can be same but it actully checks identity hashmaps first and then the reference so equals method will give false
        System.out.println(identityMap); // Output: {key=value1, key=value2}
    }
}
