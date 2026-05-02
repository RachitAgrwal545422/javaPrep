package multithreading;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ThreadSafeCache{
    private final ReentrantReadWriteLock lock =  new ReentrantReadWriteLock(true);
    private final ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    private final ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
    private final HashMap<String, String> data = new HashMap<>();

    public String get(String key){
        readLock.lock();
        try {
            return data.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public void put(String key, String value){
        writeLock.lock();
        try {
            data.put(key, value);
        } finally {
            writeLock.unlock();
        }
    }

}
public class ReadWriteLockExample {
    public static void main(String[] args) {
        ThreadSafeCache cache = new ThreadSafeCache();
        Thread a = new Thread(() -> {
             for(int i = 0; i < 10000; i++){
                 String key = "key" + i;
                 String value = "value" + i;
                 cache.put(key, value);
             }
        });
        Thread b = new Thread(() -> {
            for(int i = 0; i < 10000; i++){
                System.out.println(cache.get("key" + i));
            }
        });

        a.start();
        b.start();
    }
}
