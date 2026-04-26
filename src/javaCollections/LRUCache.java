package javaCollections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<T,V> extends LinkedHashMap<T,V> {

    private int maxSize;

    @Override
    public boolean removeEldestEntry(Map.Entry<T,V> eldest) {
        return size() > maxSize;
    }

    public LRUCache(int maxSize,float loadFactor,boolean accessOrder) {
        super(maxSize,loadFactor,accessOrder);
        this.maxSize = maxSize;
    }


    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3, 0.75f, true);

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        System.out.println(cache); // Output: {1=One, 2=Two, 3=Three}

        cache.get(1); // Accessing key 1 to make it recently used
        cache.put(4, "Four"); // This will evict key 2 as it is the least recently used

        System.out.println(cache); // Output: {3=Three, 1=One, 4=Four}
    }
}
