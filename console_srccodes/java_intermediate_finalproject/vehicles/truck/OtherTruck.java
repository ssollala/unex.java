package com.uclaextension.finalproject.vehicles.truck;

import java.time.LocalDate;

public class OtherTruck extends Truck {

	public OtherTruck(int inventoryID, String make, String model, int yearMade, LocalDate startDate, LocalDate soldDate, double carPrice, double sellingPrice, int numOfWheels) {
		super(inventoryID, make, model, yearMade, startDate, soldDate, carPrice, sellingPrice, numOfWheels);
	}
		
}
