package com.dasolkwon.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.dasolkwon.serialize.myframe.MyFrame;

/** Read the contents of product.ser file and then display information
 */

public class ReadProduct {
	private String fileName = "product.ser";
	private File file = new File(fileName);
	private FileInputStream fis;
	private ObjectInputStream in;
	private List<Product> pDetails = new ArrayList<>();
	private MyFrame myFrame = new MyFrame();
	
	public void openFile(){
	
		// check if there's a file to open
		if(!file.exists()){
			JOptionPane.showMessageDialog(myFrame.getOutputPanel(), "No Files Found.");	
		}
		else{
			try{
				fis = new FileInputStream(fileName);
				in = new ObjectInputStream(fis);
				pDetails = (ArrayList<Product>) in.readObject();
			}catch(ClassNotFoundException cnf){
				cnf.printStackTrace();
				System.err.println(cnf.getMessage());
			}catch(IOException ex){
				ex.printStackTrace();
			}

		}
		
	}
	public void closeFile(){
		try{
			if(in != null){
				in.close();
				fis.close();
			}
		}catch(IOException e){
			System.err.println("Error in closing file, program termination...");
		}
		
	}
	
	public List<Product> getPDetails(){
		return pDetails;
	}
}
