package multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLockExample {
    static int count = 0;
    public static void main(String[] args) {
        //in fair true waiting and blocked threads will get the object access in FIFO order else unfairly like intrensic locks
        ReentrantLock lock = new ReentrantLock(true);

        //Gives false if lock is already helf
        //can use lock.lock() directly if ready to wait
        if(lock.tryLock()){
            try {
                count++;
            } finally {
                lock.unlock();
            }
        }
        else{
            System.out.println("Lock is already held by another thread.");
        }
    }
}
