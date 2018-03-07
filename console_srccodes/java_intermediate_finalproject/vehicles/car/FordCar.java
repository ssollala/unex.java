package com.uclaextension.finalproject.vehicles.car;

import java.time.LocalDate;

public class FordCar extends Car {
	private static String make = "Ford";
	private static int totalFordCarsSold;
	
	public FordCar(int inventoryID, String model, int yearMade, LocalDate startDate, 
			LocalDate soldDate, double carPrice, double sellingPrice, boolean is2Door){
		super(inventoryID, make, model, yearMade, startDate, soldDate, carPrice, sellingPrice, is2Door);
		totalFordCarsSold++;
	}

	public static int getTotalFordCarsSold() {
		return totalFordCarsSold;
	}

	public static void setTotalFordCarsSold(int totalFordCarsSold) {
		FordCar.totalFordCarsSold = totalFordCarsSold;
	}

	
}
