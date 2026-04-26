package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private final Queue<Integer> buffer = new LinkedList<Integer>();

    private final int capacity;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while(buffer.size() >= capacity){
            wait();
        }

        buffer.add(item);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while(buffer.isEmpty()){
            wait();
        }

        int item = buffer.remove();
        notifyAll();
        return item;
    }
}
