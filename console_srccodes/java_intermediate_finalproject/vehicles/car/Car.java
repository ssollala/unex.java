package com.uclaextension.finalproject.vehicles.car;

import java.time.LocalDate;

import com.uclaextension.finalproject.vehicles.Vehicle;

public class Car extends Vehicle {

	private boolean is2Door; 	// if true, car is a 2 door model. else, car is a 4 door model.
	private static int totalCarsSold;
	private static String vehicleType = "Car";
	
	public Car(){
		super();
	}
	
	public Car(int inventoryID, String make, String model, int yearMade, LocalDate startDate, 
			LocalDate soldDate, double carPrice, double sellingPrice, boolean is2Door){
		
		super(inventoryID, vehicleType, make,model, yearMade, startDate, soldDate, carPrice, sellingPrice);
		this.is2Door = is2Door;
		totalCarsSold++;
	}

	// Accessors

	public static int getTotalCarsSold() {
		return totalCarsSold;
	}

	public static void setTotalCarsSold(int totalCarsSold) {
		Car.totalCarsSold = totalCarsSold;
	}
	
	public boolean is2Door() {
		return is2Door;
	}

	public void setIs2Door(boolean is2Door) {
		this.is2Door = is2Door;
	}
	
	
}
