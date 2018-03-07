package com.uclaextension.finalproject.vehicles;

import java.io.Serializable;
import java.time.LocalDate;

public class Vehicle implements Serializable{
	
	private int inventoryID;
	private String vehicleType;
	private String make;
	private String model;
	private int yearMade;
	private LocalDate startDate;
	private LocalDate soldDate;
	private double vehiclePrice;
	private double sellingPrice;
	private static int totalVehiclesSold;
	private static double totalVehiclesPrice;
	private static double totalSalesOfVehicles;
	
	
	// Constructors
	public Vehicle(){
		
	}
	public Vehicle(int inventoryID, String vehicleType, String make, String model, int yearMade, LocalDate startDate, LocalDate soldDate, double vehiclePrice, double sellingPrice){
		
		this.inventoryID = inventoryID;
		this.vehicleType = vehicleType;
		this.make = make;
		this.setModel(model);
		this.yearMade = yearMade;
		this.startDate = startDate;
		this.soldDate = soldDate;
		this.vehiclePrice = vehiclePrice;
		this.sellingPrice = sellingPrice;
		totalVehiclesSold++;
		totalVehiclesPrice += vehiclePrice;
		totalSalesOfVehicles += sellingPrice;
		
	}
	
	// Accessors
	public int getInventoryID() {
		return inventoryID;
	}
	public void setInventoryID(int inventoryID) {
		this.inventoryID = inventoryID;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYearMade() {
		return yearMade;
	}
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getSoldDate() {
		return soldDate;
	}
	public void setSoldDate(LocalDate soldDate) {
		this.soldDate = soldDate;
	}
	public double getCarPrice() {
		return vehiclePrice;
	}
	public void setCarPrice(double carPrice) {
		this.vehiclePrice = carPrice;
	}
	public double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public static double getTotalVehiclesPrice() {
		return totalVehiclesPrice;
	}
	public static void setTotalVehiclesPrice(double totalVehiclesPrice) {
		Vehicle.totalVehiclesPrice = totalVehiclesPrice;
	}
	public static int getTotalVehiclesSold() {
		return totalVehiclesSold;
	}
	public static void setTotalVehiclesSold(int totalVehiclesSold) {
		Vehicle.totalVehiclesSold = totalVehiclesSold;
	}
	public static double getTotalSalesOfVehicles() {
		return totalSalesOfVehicles;
	}
	public static void setTotalSalesOfVehicles(double totalSalesOfVehicles) {
		Vehicle.totalSalesOfVehicles = totalSalesOfVehicles;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
}
