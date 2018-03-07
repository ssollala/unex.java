package com.uclaextension.finalproject.vehicles.car;

import java.time.LocalDate;

public class DodgeCar extends Car {
	private static String make = "Dodge";
	
	public DodgeCar(int inventoryID, String model, int yearMade, LocalDate startDate, 
			LocalDate soldDate, double carPrice, double sellingPrice, boolean is2Door){
		super(inventoryID, make, model, yearMade, startDate, soldDate, carPrice, sellingPrice, is2Door);
	}

}
