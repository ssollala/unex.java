package com.uclaextension.finalproject.vehicles;

public class Main {

	public static void main(String[] args) {

		WriteReport write = new WriteReport();
		ReadReport read = new ReadReport();

		// open/create file
		write.collectData();
		write.createFile();
		write.closeFile();

		// display data as report
		read.openFile();
		read.closeFile();		
	
	}

}
