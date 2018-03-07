package bounce_thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import badbounce.Ball;
import badbounce.BallComponent;

public class BounceThread {

	public static void main(String args[]){
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run() {
				JFrame frame = new BounceFrame();
				frame.setTitle("BounceThread");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);			
			}
		});
	}
}

class BallRunnable implements Runnable
{

	private Ball ball;
	private BallComponent comp;
	public static final int STEPS = 1000;
	public static final int DELAY = 3;
	
	public BallRunnable(Ball aBall, BallComponent aComponent){
		ball = aBall;		// the ball to bounce 
		comp = aComponent;	// the component in which the ball bounces
	}
	
	@Override
	public void run() {
		try{
			for(int i=1; i<=STEPS; i++){
				// movement of the ball
				ball.move(comp.getBounds());
				comp.paint(comp.getGraphics());
				Thread.sleep(DELAY);
			}
				
		}catch(InterruptedException e){
			
		}		
	}	
}

class BounceFrame extends JFrame{
	private BallComponent comp;
	
	public BounceFrame(){

		comp = new BallComponent();
		add(comp, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		
		addButton(buttonPanel, "Start", new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				addBall();		
			}
			
		});
		
		addButton(buttonPanel, "Close", new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}		
		});
		
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}

/**
 * Adds a button to a container
 */
	public void addButton(Container c, String title, ActionListener listener){
	
	JButton button = new JButton(title);	
	c.add(button);

	button.addActionListener(listener);
	}
	
	/**
	 * Adds a bouncing ball to the canvas and starts a thread to make it bounce
	 */

	public void addBall(){
			Ball ball = new Ball();
			comp.add(ball);
			
			Runnable r = new BallRunnable(ball, comp);
			Thread t = new Thread(r);
			t.start();	
	}
}
