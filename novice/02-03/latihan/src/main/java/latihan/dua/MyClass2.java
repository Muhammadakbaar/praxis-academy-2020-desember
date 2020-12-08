package latihan.dua;

import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 

// Code for Concurrent programming using 
// Lambda Expression 
public class MyClass2 {

    // Driver method
    public static void mulai() {
        new MyClass2().startThreads();
	} 

	// Starting threads with pool size as 2 
	private void startThreads() 
	{ 
		ExecutorService taskList 
			= Executors.newFixedThreadPool(2); 

		for (int i = 0; i < 5; i++) { 

			int finalI = i + 1; 

			// Prints thread name and value 
			// of the counter variable 
			taskList.execute(() -> { 

				for (int j = 0; j < finalI; j++) { 

					System.out.println( 
						Thread 
							.currentThread() 
							.getName() 
						+ " Counter:" + j); 
					pause(Math.random()); 
				} 
			}); 
		} 
		taskList.shutdown(); 
	} 

	// Pauses execution allowing time for 
	// system to switch back and forth 
	private void pause(double seconds) 
	{ 
		try { 
			Thread.sleep( 
				Math.round(1000.0 * seconds)); 
		} 
		catch (InterruptedException e) { 
			e.printStackTrace(); 
		} 
	} 
} 
