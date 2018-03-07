package com.uclaextension.mammalproject;
//import java.util.Comparator;

public abstract class Mammal{

	private static int numberOfMammals = 0;
	 
	private String animalId;
	private String name;
	private String gender;
	private int age;
	private String food;
	private int numberOfLegs;
	private int interval;		// Information regarding when the cage needs cleaning
	
	// Constructors
	public Mammal(){
		 this.animalId = "";
		 this.name = "";
		 this.gender = "";
		 this.age = 0;
		 this.food = "";
		 this.numberOfLegs = 0;
		 this.interval = 1;				// Cleaned everyday
	
		 numberOfMammals++;
		 
	}
	 
	public Mammal(String animalId, String name, String gender, int age, String food, int numberOfLegs, int interval){
		 this.animalId = animalId;
		 this.name = name;
		 this.gender = gender;
		 this.age = age;
		 this.food = food;
		 this.numberOfLegs = numberOfLegs;
		 this.interval = interval;
		 numberOfMammals++;
	}
	 
	// Accessors
	public String getAnimalId() {
		return animalId;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
			return gender;
	}

	public int getAge() {
		return age;
	}

	public String getFood() {
		return food;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}


	public int getNumberOfMammals(){
		 return numberOfMammals;
	 }

	public int getInterval() {
		return interval;
	}
	
	public abstract void clean();
	public abstract String cleanOrNot();
	public abstract void eat();
	
	@Override
	public String toString() {
		return "Mammal [animalId=" + animalId + ", name=" + name + ", gender=" + gender + ", age=" + age + ", food=" + food
				+ "]";
	}


}
