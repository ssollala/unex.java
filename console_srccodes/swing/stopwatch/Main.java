package com.uclaextension.dkwon.stopwatch;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// Creating our frame on event dispatching thread (need a thread separately)
		SwingUtilities.invokeLater(new Runnable(){
			// Runnable object creates GUI
			public void run(){
				new StopWatch();
			}
		});

	}

}
