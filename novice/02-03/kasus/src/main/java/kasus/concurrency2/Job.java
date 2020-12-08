package kasus.concurrency2;

import java.util.List;

public class Job {
    private boolean running = false;
    private final String filename;
 
    public Job(String filename) {
        this.filename = filename;
    }
 
    public synchronized void start() {
        if(running) {
            throw new IllegalStateException("...");
        }
        System.out.println("satu");
    }
 
    public synchronized List getResults() {
        if(!running) {
            throw new IllegalStateException("...");
        }
    
        return getResults();
    }
}

/* public class Job {
    private final String filename;
 
    private Job(String filename) {
        this.filename = filename;
    }
 
    public static Job createAndStart(String filename) {
        Job job = new Job(filename);
        job.start();
        return job;
    }
 
    private void start() {
        ...
    }
 
    public synchronized List getResults() {
        ...
    }
} */