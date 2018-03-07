package demo2;

public class Runner implements Runnable{
	
	// entry point for the thread. executed by calling start() method
	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Hello " + i);	
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
