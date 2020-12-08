package kasus.concurrency3;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {
 
    public void execute(Runnable r) {
        (new Thread(r)).start();
    }
}