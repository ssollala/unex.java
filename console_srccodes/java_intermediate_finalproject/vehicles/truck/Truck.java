package com.uclaextension.finalproject.vehicles.truck;

import java.time.LocalDate;

import com.uclaextension.finalproject.vehicles.Vehicle;

public class Truck extends Vehicle {
	
	private int numOfWheels;
	private static int totalTrucksSold;
	private static String vehicleType = "Truck";
	
	public Truck(){
		super();
	}
	
	public Truck(int inventoryID, String make, String model, int yearMade, LocalDate startDate, LocalDate soldDate, double carPrice, double sellingPrice, int numOfWheels){
		
		super(inventoryID, vehicleType, make, model, yearMade, startDate, soldDate, carPrice, sellingPrice);
		this.setNumOfWheels(numOfWheels);
		totalTrucksSold++;
		
	}

	// Accessors
	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public static int getTotalTrucksSold() {
		return totalTrucksSold;
	}

	public static void setTotalTrucksSold(int totalTrucksSold) {
		Truck.totalTrucksSold = totalTrucksSold;
	}
}
