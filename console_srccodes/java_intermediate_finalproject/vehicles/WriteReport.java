package com.uclaextension.finalproject.vehicles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import com.uclaextension.finalproject.vehicles.car.Car;
import com.uclaextension.finalproject.vehicles.car.DodgeCar;
import com.uclaextension.finalproject.vehicles.car.FordCar;
import com.uclaextension.finalproject.vehicles.car.OtherCar;
import com.uclaextension.finalproject.vehicles.truck.FordTruck;
import com.uclaextension.finalproject.vehicles.truck.OtherTruck;
import com.uclaextension.finalproject.vehicles.truck.Truck;


public class WriteReport {
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	private ObjectOutputStream vehicleOutput;
	private FileOutputStream fileOut;
	
	String filename = "samsautos.ser";

	// collect data
	public void collectData(){
		
		Car car1 = new FordCar(1, "Crown Victoria", 2010, LocalDate.of(2012, Month.JULY, 3), LocalDate.of(2012, Month.JULY, 23), 8900, 14000, false);
		Car car2 = new OtherCar(2, "Toyota", "Camry", 2009, LocalDate.of(2012, Month.JULY, 23), LocalDate.of(2012, Month.JULY, 27), 7600, 17500, false);
		Truck truck1 = new FordTruck(3, "F-150", 2010, LocalDate.of(2012, Month.JULY, 21), LocalDate.of(2012, Month.JULY, 29), 17600, 27500, 4);
		Truck truck2 = new FordTruck(7, "F-450", 2010, LocalDate.of(2012, Month.JULY, 14), LocalDate.of(2012, Month.JULY, 30), 17600, 39500, 6);
		Truck truck3 = new OtherTruck(4, "GMC", "Sierra 1500", 2009, LocalDate.of(2012, Month.JULY, 2), LocalDate.of(2012, Month.JULY, 24), 11600, 19500, 4);
		Car car3 = new DodgeCar(5, "Caravan", 2009, LocalDate.of(2012, Month.JULY, 7), LocalDate.of(2012, Month.JULY, 18), 2600, 9500, false);
		Car car4 = new FordCar(6, "Mustang", 2009, LocalDate.of(2012, Month.JULY, 14), LocalDate.of(2012, Month.AUGUST, 23), 12600, 25600, true);
		
		vehicles.add(car1);
		vehicles.add(car2);
		vehicles.add(truck1);
		vehicles.add(truck2);
		vehicles.add(truck3);
		vehicles.add(car3);
		vehicles.add(car4);
	}
	
	// create file and store collected data in the file
	public void createFile(){
		try{
			fileOut = new FileOutputStream("samsautos.ser");
			vehicleOutput = new ObjectOutputStream(fileOut);

			for(Vehicle c: vehicles){
				vehicleOutput.writeObject(c);
			}
		}catch(IOException io){		
			System.err.println("Error writing product object, program terminationg...");
			System.exit(1);			
		}
	}
	
	// close file
	public void closeFile(){
		try{
			if(vehicleOutput != null){
				vehicleOutput.close();
			}
		}catch(IOException e){
			System.err.println("Error in closing file, program termination...");
			e.printStackTrace();
		}
	}
	
	public class AppendingObjectOutputStream extends ObjectOutputStream {

		  public AppendingObjectOutputStream(FileOutputStream fileOut) throws IOException {
		    super(fileOut);
		  }

		  @Override
		  protected void writeStreamHeader() throws IOException { 
		    reset();
		  }

		}
}
