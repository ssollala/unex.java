package com.pluralsight.filestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String data[] = {
				"Line 1" +
			    "\nLine 2"+
			    "\nLine 3"+	
			    "\nLine 4"
		};
		
		try {
			writeData(data);
			readData();
		} catch (IOException e) {
			e.printStackTrace();
		}	

	}
	
	public static void writeData(String[] data) throws IOException{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt") )){
			for(String s:data){
				bw.write(s);
				bw.newLine();		// add new line(line break character)
			}
		}
	}
	
	public static void readData() throws IOException{
		
		String line = null;
		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
			while((line = br.readLine()) != null){
				String[] parts = line.split(" ");
				// no space between two words
				System.out.println(parts[0] + parts[1]);
			}
		}
	}
	

}
