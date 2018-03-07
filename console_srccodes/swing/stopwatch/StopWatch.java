package com.uclaextension.dkwon.stopwatch;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StopWatch implements ActionListener {

	static boolean paused = false;
	static boolean stopped = false;
	
	JLabel aJLabel;
	JButton startButton;
	JButton stopButton;
	JButton pauseButton;
	JButton resetButton;
	
	long start;				
	long pausedAt;
	long pauseElapsed;		// Track elapsed time between Pause and Start
	long restart;			
	double elapsed;
	
	public StopWatch(){
		// Create JFrame
		JFrame aJFrame = new JFrame("My Stopwatch");
		
		// Set frame size and background color
		aJFrame.setSize(300, 90);
		aJFrame.getContentPane().setBackground(Color.WHITE);
		
		// Use FlowLayout for the application
		aJFrame.getContentPane().setLayout(new FlowLayout());
	
		// Close the application when window is closed
		aJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// Set up start/pause/stop buttons and label for Stopwatch
		aJLabel = new JLabel("Press START");
		startButton = new JButton("START");
		pauseButton = new JButton("PAUSE");
		stopButton = new JButton("STOP");
		
		// Set the label's text color
		aJLabel.setForeground(Color.BLUE);

		// Set up action listeners
		startButton.addActionListener(this);
		pauseButton.addActionListener(this);
		stopButton.addActionListener(this);
		
		 // Add widgets to content pane
		aJFrame.getContentPane().add(startButton);
		aJFrame.getContentPane().add(pauseButton);
		aJFrame.getContentPane().add(stopButton);
		aJFrame.getContentPane().add(aJLabel);
		
		
		// Set the frame to visible
		aJFrame.setVisible(true);
			
	}

	// Set up button handle event
	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar aCalendar = Calendar.getInstance();
		
		if(e.getActionCommand().equals("START")){
			// Reset the stop status when started
			stopped = false;
			
			aJLabel.setText("Stopwatch is running...");	
			
			// Check if the Stopwatch is paused
			if(paused){
				restart = aCalendar.getTimeInMillis();
				pauseElapsed += (restart - pausedAt);	
				paused = false;
			}
			else{
				start = aCalendar.getTimeInMillis();
			}
		}
		else if(e.getActionCommand().equals("PAUSE")){
			if(!paused && !stopped && start != 0){
					paused = true;
					pausedAt = aCalendar.getTimeInMillis();		
					aJLabel.setText("Stopwatch is paused...");
//				}
			}
		}
		else{
			if(!stopped && start != 0){
				// Check if the Stopwatch was paused before being stopped
				if(paused || pausedAt != 0){							
					aJLabel.setText("Elased time is " + 
							(double) (aCalendar.getTimeInMillis() - start - pauseElapsed - (aCalendar.getTimeInMillis()-pausedAt)) / 1000);
					// Reset the status of being paused
				}
				else{
					aJLabel.setText("Elased time is " + 
							(double) (aCalendar.getTimeInMillis() - start - pauseElapsed) / 1000);
				}
			}			
			// Change the status of being stopped
			stopped = true;
			// Reset other features
			start = 0;	
			paused = false;
		}
	}
}
