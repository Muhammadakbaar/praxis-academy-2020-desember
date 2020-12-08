package latihan.dua;

import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 

// Java Program to depict Concurrent 
// Programming in action 
public class OuterClass { 

	// Driver method 
	public static void mulai() 
	{ 
		new OuterClass().startThreads(); 
	} 

	// Starts the threads and calls run method 
	// method of the runnable interface 
	private void startThreads() 
	{ 
		ExecutorService taskList 
			= Executors.newFixedThreadPool(2); 

		taskList.execute(new InnerClass(1)); 
		taskList.execute(new InnerClass(2)); 
		taskList.execute(new InnerClass(3)); 
		taskList.execute(new InnerClass(4)); 
		taskList.execute(new InnerClass(5)); 
		taskList.shutdown(); 
	} 

	// Pauses execution allowing time for 
	// system to switch back and forth 
	private void pause(double seconds) 
	{ 
		try { 
			Thread.sleep(Math.round(1000.0 * seconds)); 
		} 
		catch (InterruptedException e) { 
			e.printStackTrace(); 
		} 
	} 

	// Inner Class 
	public class InnerClass implements Runnable { 

		private int loopLimit; 

		// Constructor to define 
		// different limits 
		InnerClass(int loopLimit) 
		{ 
			this.loopLimit = loopLimit; 
		} 

		// Prints thread name and value 
		// of the counter variable 
		@Override
		public void run() 
		{ 
			for (int i = 0; i < loopLimit; i++) { 
				System.out.println( 
					Thread.currentThread().getName() 
					+ " Counter: " + i); 
				pause(Math.random()); 
			} 
		} 
	} 
} 
