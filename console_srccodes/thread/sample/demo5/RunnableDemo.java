package demo5;

public class RunnableDemo implements Runnable{

	Thread t;
	private String threadName;
	
	public RunnableDemo(String threadName){
		this.threadName = threadName;
		System.out.println("Creating " + this.threadName);
	}
	
	@Override
	public void run(){
		try {
		for(int i=0; i<5; i++){
			System.out.println("Hello " + i);
				Thread.sleep(100);
		}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}		

	
	// once a thread is created, start() method calls run() methods
	public void start(){
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	}
}
