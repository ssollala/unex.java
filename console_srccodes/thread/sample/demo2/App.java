package demo2;

public class App {
 
	public static void main(String[] args){
		// This can't call run method in Runner class
//		Runner r1 = new Runner();
//		r1.start();
		
		/**
		 * Thread created implementing Runnable interface
		 * To execute the class, 
		 * 1. Create an object of the class implementing the interface
		 * 2. Create a Thread object with the earlier object as constructor argument
		 * 3. Call the start method on the thread
		 */
		Runner r1 = new Runner();
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(new Runner());
		t2.start();
		
	}
}
