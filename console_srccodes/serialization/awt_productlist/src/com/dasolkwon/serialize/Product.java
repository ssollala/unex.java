package com.dasolkwon.serialize;

import java.io.Serializable;

public class Product implements Serializable {
	private int productID;
	private String description;
	private String manufacturer;
	private double price;
	private int count;
	
	public Product(int productID, String description, String manufacturer, double price, int count) {
		this.productID = productID;
		this.description = description;
		this.manufacturer = manufacturer;
		this.price = price;
		this.count = count;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count){
		this.count = count;
	}

}
