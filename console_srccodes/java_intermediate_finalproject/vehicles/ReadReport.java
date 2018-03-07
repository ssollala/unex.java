package com.uclaextension.finalproject.vehicles;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import com.uclaextension.finalproject.vehicles.car.Car;
import com.uclaextension.finalproject.vehicles.car.FordCar;
import com.uclaextension.finalproject.vehicles.truck.FordTruck;
import com.uclaextension.finalproject.vehicles.truck.Truck;

public class ReadReport {
	private ObjectInputStream vehicleInput = null;
	private FileInputStream fileIn = null;
	private ArrayList<Vehicle> vehicleList = new ArrayList<>();		// read the stored list of data in the file
	private NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	public ReadReport(){
		// set the maximum faction numbers for the amount displayed 
		currency.setMaximumFractionDigits(0);
		
		// report header
		System.out.println("Monthly Report:\n");
		System.out.println("Today's date: " + toStringDate(LocalDate.of(2012, Month.AUGUST, 1)));
		System.out.printf("%-17s%-15s%-15s%-20s%-10s%-25s%-17s%-25s%-20s%-20s%n", 
				"Inventory ID", "Vehicle Type", "Make", "Model", "Year", "Start Inventory Date", "Sold Date", "Dealer's Car Price", "Sold Price", "# of Doors/Wheels" );	
		System.out.println("---------------------------------------------------------------------------------------------------------"
				+ "-----------------------------------------------------------------------------");
	}
	
	// open file and display the stored data
	public void openFile(){
		try{
			// open file and read the data stored in the file
			fileIn = new FileInputStream("samsautos.ser");
			vehicleInput = new ObjectInputStream(fileIn);
			while(true){
				vehicleList.add( (Vehicle) vehicleInput.readObject());				
			}	
		}catch(EOFException e){
			// end of file, display data in the file
			for(Vehicle v: vehicleList){
				if(v instanceof Car){
					int numbOfDoor = 4;
					if(((Car) v).is2Door()){
						numbOfDoor = 2;
					}
					System.out.printf("%-17s%-15s%-15s%-20s%-10s%-25s%-17s%-25s%-20s%-20s%n", 
						v.getInventoryID(),
						v.getVehicleType(),
						v.getMake(),
						v.getModel(),
						v.getYearMade(),
						v.getStartDate(),
						v.getSoldDate(),
						currency.format(v.getCarPrice()),
						currency.format(v.getSellingPrice()),
						(numbOfDoor + " doors"));
				}
				if(v instanceof Truck){
					System.out.printf("%-17s%-15s%-15s%-20s%-10s%-25s%-17s%-25s%-20s%-20s%n", 
						v.getInventoryID(),
						v.getVehicleType(),
						v.getMake(),
						v.getModel(),
						v.getYearMade(),
						v.getStartDate(),
						v.getSoldDate(),
						currency.format(v.getCarPrice()),
						currency.format(v.getSellingPrice()),
						((Truck) v).getNumOfWheels() + " wheels");
				}	
				
			}	
			
			System.out.println("\nSummary:");	
			System.out.print("Inventory IDs for cars that are 4-door models: ");
			for(Vehicle v: vehicleList){
				if(v instanceof Car){
					if(!((Car) v).is2Door()){
						System.out.print(v.getInventoryID() + " ");
					}
				}
			}
			
			System.out.println();
			System.out.println("Total number of vehicles sold during the period : " + Vehicle.getTotalVehiclesSold());
			System.out.println("Total number of cars sold: " + Integer.toString(Car.getTotalCarsSold()));
			System.out.println("Total number of Ford cars sold: " + Integer.toString(FordCar.getTotalFordCarsSold()));
			System.out.println("Total number of trucks sold: " + Integer.toString(Truck.getTotalTrucksSold()));
			System.out.println("Total number of Ford trucks sold: " + Integer.toString(FordTruck.getTotalFordTrucksSold()));
			System.out.println("Total dealer's car cost of all vehicles: " + currency.format(Vehicle.getTotalVehiclesPrice()));
			System.out.println("Total sales of all vehicles: " + currency.format(Vehicle.getTotalSalesOfVehicles()));
			System.out.println("Net Profit: " + currency.format(Vehicle.getTotalSalesOfVehicles() - Vehicle.getTotalVehiclesPrice()));
			System.out.println();
			System.out.println("End of Monthly Report");
						
		}catch (ClassNotFoundException cnf) {
			System.err.println("Invalid product object...");			
		}catch(IOException io){
			System.err.println("No files found...");
			System.err.println(io.getMessage());
			System.exit(1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void closeFile(){
		try{
			if(vehicleInput != null){
				vehicleInput.close();
			}
		}catch(IOException e){
			System.err.println("Error in closing file, program termination...");
		}
		
	}
	
	public String toStringDate(LocalDate date){
		return date.getMonthValue() + "/" + date.getDayOfMonth() + "/" + date.getYear();
	}
}
