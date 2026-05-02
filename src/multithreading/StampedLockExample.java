package multithreading;

import java.util.concurrent.locks.StampedLock;

class BankBalance {
    int balance;

    StampedLock lock = new StampedLock();

    int getBalance() {
        long stamp = lock.tryOptimisticRead();
        int currentBalance = balance;

        if(lock.validate(stamp)){ return currentBalance; }

        stamp = lock.readLock();
        try {
            return balance;
        } finally {
            lock.unlockRead(stamp);
        }
    }

    void deposit(int balance) {
        long stamp = lock.writeLock();
        try {
            this.balance += balance;
        } finally {
            lock.unlockWrite(stamp);
        }
    }
}
public class StampedLockExample {
        public static void main(String[] args) {
            BankBalance bankBalance = new BankBalance();
            Thread a = new Thread(() -> {
                for(int i = 0; i < 10000; i++){
                    bankBalance.deposit(100);
                }
            });
            Thread b = new Thread(() -> {
                for(int i = 0; i < 10000; i++){
                    System.out.println(bankBalance.getBalance());
                }
            });

            a.start();
            b.start();
        }
}
