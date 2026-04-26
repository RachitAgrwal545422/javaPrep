package javaCollections;

public class weakHashMapExample {
    public static void main(String[] args) {
            //WeakHashMap is a special implementation of the Map interface in Java that uses weak references for its keys.
            //This means that if a key in a WeakHashMap is no longer referenced elsewhere in the program, it can be garbage collected, and the entry will be automatically removed from the map.

            //This is particularly useful for caching scenarios where you want to allow entries to be removed when they are no longer needed, without having to explicitly manage the lifecycle of the entries.

            //Example usage:
            java.util.WeakHashMap<String, String> weakMap = new java.util.WeakHashMap<>();

            String key1 = new String("key1");
            String key2 = new String("key2");

            weakMap.put(key1, "value1");
            weakMap.put(key2, "value2");

            System.out.println("Before GC: " + weakMap);

            // Remove strong references to the keys
            key1 = null;
            key2 = null;

            // Suggest garbage collection
            System.gc();

            // Wait for a moment to allow GC to complete
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("After GC: " + weakMap);
    }
}
