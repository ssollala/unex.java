package com.uclaextension.finalproject.vehicles.truck;

import java.time.LocalDate;

public class FordTruck extends Truck {
	
	private static String make = "Ford";
	private static int totalFordTrucksSold;
	
	public FordTruck(int inventoryID, String model, int yearMade, LocalDate startDate, LocalDate soldDate, double carPrice, double sellingPrice, int numOfWheels){
		super(inventoryID, make, model, yearMade, startDate, soldDate, carPrice, sellingPrice, numOfWheels);
		totalFordTrucksSold++;
		
	}

	public static int getTotalFordTrucksSold() {
		return totalFordTrucksSold;
	}

	public static void setTotalFordTrucksSold(int totalFordTrucksSold) {
		FordTruck.totalFordTrucksSold = totalFordTrucksSold;
	}

}
