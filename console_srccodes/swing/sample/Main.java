package com.uclaextension.dasol.stringusage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main {
	
	Main(){
		// setup GUI Information-all GUI tends to have JFrame container
		// Create a JFrame container:rectangular window with system menu and standard top window
		JFrame aJFrame = new JFrame("Our First Ride on a Swing");
		
		// Set the size of the frame
		aJFrame.setSize(1200, 900);
		
		// End the program when the user closes the window
		// here, we use the default and standard
		aJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a label
		JLabel aLabel = new JLabel("A Swing in a high flying thing");
		
		// Add image to the label
		ImageIcon javaIcon = new ImageIcon("images/java.png");
		aLabel.setIcon(javaIcon);
		
		// Add the label to the frame
		// = Add to the Content Pane
		aJFrame.add(aLabel);
		//aJFrame.getContentPane().add(aLable)
		
		// Make the frame and label visible
		aJFrame.setVisible(true);
			
	}
	public static void main(String[] args) {
		// Creating our frame on event dispatching thread (need a thread separately)
		SwingUtilities.invokeLater(new Runnable(){
			// Runnable object creates GUI
			public void run(){
				// extend Main 
				new Main();
			}
		});
		
		// When we use Applet, generally use invokeAndWait
		// When we use Applications, generally use invokeLater

	}

}
