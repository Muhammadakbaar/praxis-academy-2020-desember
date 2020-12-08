package kasus.concurrency2;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SynchronizedAndWait {
    private static final Queue queue = new ConcurrentLinkedQueue();
 
    public synchronized Integer getNextInt() {
        Integer retVal = null;
        while (retVal == null) {
            synchronized (queue) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                retVal = queue.poll();
            }
        }
        return retVal;
    }
 
    public synchronized void putInt(Integer value) {
        synchronized (queue) {
            queue.add(value);
            queue.notify();
        }
    }
 
    public static void main(String[] args) throws InterruptedException {
        final SynchronizedAndWait queue = new SynchronizedAndWait();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    queue.putInt(i);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Integer nextInt = queue.getNextInt();
                    System.out.println("Next int: " + nextInt);
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}