package com.dasolkwon.drawshapes2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.dasolkwon.drawshapes2.view.DrawArea;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				DrawArea application = new DrawArea();
				application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				application.setSize(750, 600);
				application.setVisible(true);	
			}
			
		});
		

	}

}
