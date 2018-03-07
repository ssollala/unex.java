package com.uclaextension.mammalproject;

import java.time.LocalDate;

public class Dolphin extends Mammal {
	
	private static LocalDate lastCleanedDate;
	private static int numberOfDolphins = 0;
	private static int numberOfLegs = 0;
	private static String food = "Dolphin Fish";
	private static int interval = 7;				// Clean the cage once a week

	private String family;
	private String type;
	
	public Dolphin(String animalId, String name, String gender, int age, String family, String type){
		super(animalId, name, gender, age, food, numberOfLegs, interval);
		numberOfDolphins++;		
		this.family = family;
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public static int getNumberOfDolphins() {
		return numberOfDolphins;
	}
	
	public static LocalDate getLastCleanedDate() {
		return lastCleanedDate;
	}

	public static void setLastCleanedDate(LocalDate lastCleanedDate) {
		Dolphin.lastCleanedDate = lastCleanedDate;
	}
	
	public String getFamily() {
		return family;
	}

	@Override
	public String cleanOrNot() {
			LocalDate currentDate = LocalDate.now();
			// The cage needs cleaning
			if(currentDate.equals(getLastCleanedDate().plusDays(interval)) || 
					currentDate.isAfter(getLastCleanedDate().plusDays(interval)) == true ){
				return "Yes";
			}
			return "No";		
	}

	@Override
	public void clean() {
		if(cleanOrNot().equals("Yes")){
			setLastCleanedDate(LocalDate.now());
			System.out.println("The cage for dolphins is now cleaned "
					+ "and the date when the cage was last cleaned is updated.");			
		}
	}
		
	@Override
	public void eat() {
		System.out.println("Dolphins are eating " + getFood());
	}
	
	@Override
	public String toString() {
		return "Dolphin [ID=" + getAnimalId() + ", Name=" + getName() + ", Family=" + getFamily() + ", Type=" + getType() +", Gender=" + getGender() + ", Age=" + getAge() 
			+ ", Number of leg(s)=" + getNumberOfLegs()  + ", Food=" + getFood() 
			+ ", Total number of dolphins=" + getNumberOfDolphins() + ", Cage cleaned date=" 
			+ getLastCleanedDate() + ", Does cage needs cleaning? " + cleanOrNot() +"]" + "\n";
		
	}


}
