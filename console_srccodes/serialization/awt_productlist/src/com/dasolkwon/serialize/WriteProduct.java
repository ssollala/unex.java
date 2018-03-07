package com.dasolkwon.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/** Collect user input for the above product class 
 * and serialize the input into a file named product.ser
 */
public class WriteProduct {
	
	private FileOutputStream fos = null;
	private ObjectOutputStream out = null;

	private FileInputStream fis;
	private ObjectInputStream in;
	
	private List<Product> pList = new ArrayList<>();
	
	private String fileName = "product.ser";
	private File file = new File(fileName);
	private boolean firstRound = true;
	
	public WriteProduct(){
		
	}

	public WriteProduct(int productID, String description, String manufacturer, double price, int count){
		Product product = new Product(productID, description, manufacturer, price, count);
	
		try{
			// check if "product.ser" already created but never opened after opening the current window 
			// if exists, merge the existing product information with the new information
			if(file.exists() && firstRound){
				try{
					fis = new FileInputStream(fileName);
					in = new ObjectInputStream(fis);
					pList = (ArrayList<Product>) in.readObject();
					in.close();
					fis.close();
					firstRound = false;
				}catch(ClassNotFoundException ex){
					ex.printStackTrace();
				}catch(IOException ex){
					ex.printStackTrace();
				}	
			}
			
			pList.add(product);
			
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(pList);
			
		}catch(IOException ex){
				ex.printStackTrace();
		}
	}
	
	public void closeFile(){
		try{
			if(out != null){
				out.close();
			}
		}catch(IOException e){
			System.err.println("Error in closing file, program termination...");
			e.printStackTrace();
		}
	}
	
	public List<Product> getPList(){
		return pList;
	}
}
