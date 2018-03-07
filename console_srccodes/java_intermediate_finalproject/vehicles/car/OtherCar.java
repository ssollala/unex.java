package com.uclaextension.finalproject.vehicles.car;

import java.time.LocalDate;

public class OtherCar extends Car {

	public OtherCar(int inventoryID, String make, String model, int yearMade, LocalDate startDate, 
			LocalDate soldDate, double carPrice, double sellingPrice, boolean is2Door) {
		super(inventoryID, make, model, yearMade, startDate, soldDate, carPrice, sellingPrice, is2Door);
	}
		
}
