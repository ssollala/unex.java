package com.dasolkwon.serialize.myframe;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {
	public static void main(String args[])
	{
		EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
            	MyFrame myFrame = new MyFrame();
            	
            	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	
                myFrame.setVisible(true);
   
            }
        });
	}
}
