package kasus.concurrency1;

public class NotSynchronizedCounter implements Runnable {
    private static int counter = 0;
 
    // not synchronized
    public void run() {
        while(counter < 10) {
            System.out.println("["+Thread.currentThread().getName()+"] before: "+counter);
            counter++;
            System.out.println("["+Thread.currentThread().getName()+"] after: "+counter);
        }
    }
 
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for(int i=0; i<threads.length; i++) {
            threads[i] = new Thread(new NotSynchronizedCounter(), "thread-"+i);
            threads[i].start();
        }
        for(int i=0; i<threads.length; i++) {
            threads[i].join();
        }
    }

    
    /* public class LocalSync {
        private Integer sync = 0;
     
        public void someMethod() {
            synchronized (sync) {
                // synchronized on instance level
            }
        }
    }

    public class MethodSync {
        private Integer sync = 0;
     
        public synchronized void someMethod() {
            // synchronized on instance level
        }
    }

    public class StaticSync {
        private static Integer sync = 0;
     
        public void someMethod() {
            synchronized (sync) {
                // synchronized on ClassLoader/JVM level
            }
        }
    } */

}