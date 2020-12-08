package latihan.dua;

import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 

// Concurrent programming using 
// Anonymous Inner Class 
public class MyClass { 

	// Driver method 
	public static void mulai() 
	{ 
		new MyClass().startThreads(); 
	} 

	// Starting threads with pool size as 2 
	private void startThreads() 
	{ 
		ExecutorService taskList 
			= Executors.newFixedThreadPool(2); 

		for (int i = 0; i < 5; i++) { 
			int finalI = i + 1; 

			// Giving the class definition 
			// and instantiating it all at once 
			taskList.execute(new Runnable() { 

				// Prints thread name and value 
				// of the counter variable 
				@Override
				public void run() 
				{ 
					for (int j = 0; j < finalI; j++) { 
						System.out.println( 
							Thread 
								.currentThread() 
								.getName() 
							+ " Counter:" + j); 
						pause(Math.random()); 
					} 
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
