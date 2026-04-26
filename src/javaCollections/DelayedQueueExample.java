package javaCollections;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayedQueueExample {
    static class DelayedTask implements Delayed {
        private String name;
        private long delayTime;

        public DelayedTask(String name, long delayTime) {
            this.name = name;
            this.delayTime = System.currentTimeMillis() + delayTime;
        }

        @Override
        public long getDelay(java.util.concurrent.TimeUnit unit) {
            long diff = delayTime - System.currentTimeMillis();
            return unit.convert(diff, java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            if (this.delayTime < ((DelayedTask) o).delayTime) {
                return -1;
            }
            if (this.delayTime > ((DelayedTask) o).delayTime) {
                return 1;
            }
            return 0;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDelayTime(long delayTime) {
            this.delayTime = delayTime;
        }
    }
    public static void main(String[] args) {
        //It is an unbounded blocking queue
        //An element will remove when it's delay will expire
        DelayQueue<DelayedTask> delayQueue = new DelayQueue<>();

        delayQueue.add(new DelayedTask("Task1", 5000)); // Task1 will be available after 5 seconds
        delayQueue.add(new DelayedTask("Task2", 3000)); // Task2 will be available after 3 seconds
        delayQueue.add(new DelayedTask("Task3", 4000));
        delayQueue.add(new DelayedTask("Task4", 5000));

        while (!delayQueue.isEmpty()) {
            DelayedTask task = delayQueue.poll();
            System.out.println(task);
        }
    }
}
