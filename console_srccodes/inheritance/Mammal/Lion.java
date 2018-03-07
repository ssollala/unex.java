package com.uclaextension.mammalproject;

import java.time.LocalDate;

public class Lion extends Mammal {
	
	private static LocalDate lastCleanedDate;		// Lions are all in the same cage, so there's only one cleaning date
	private static int numberOfLions = 0;
	private static int numberOfLegs = 4;
	private static String food = "Chicken Liver";
	private static int interval = 3;				// Clean the cage every three days
	private String region;

	public Lion(String animalId, String name, String gender, int age, String region){
		super(animalId, name, gender, age, food, numberOfLegs, interval);
		this.region = region;
		numberOfLions++;		
	}
	
	public int getNumberOfLions() {
		return numberOfLions;
	}

	public static LocalDate getLastCleanedDate() {
		return lastCleanedDate;
	}

	public static void setLastCleanedDate(LocalDate lastCleanedDate) {
		Lion.lastCleanedDate = lastCleanedDate;
	}

	public String getRegion() {
		return region;
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
			System.out.println("The cage for lions is now cleaned "
					+ "and the date when the cage was last cleaned is updated.");
		}	
	}
	
	@Override
	public void eat() {
		System.out.println("Lions are eating " + getFood());	
	}
	
	@Override
	public String toString() {
		return "Lion [ID=" + getAnimalId() + ", Name=" + getName() + ", Region=" + getRegion() + ", Gender=" + getGender() 
				+ ", Age=" + getAge() + ", Number of leg(s)=" + getNumberOfLegs() + ", Food=" + getFood() 
				+ ", Total number of lions=" + getNumberOfLions() + ", Cage cleaned date=" + getLastCleanedDate() 
				+", Does cage needs cleaning? " + cleanOrNot() +"]" 
				+ "\n";
	}

	

}
