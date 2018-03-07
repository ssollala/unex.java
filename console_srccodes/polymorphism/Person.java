package com.dasol.polymorphism;

public abstract class Person {
	private String lastName;
	private String firstName;
	private double height;
	private double weight;
	private static int numberOfPerson = 0;
	
	// Constructors 
	// Handle no information
	public Person(){
		this.lastName = "Unknown";
		this.firstName = "Unknown";
		this.height = 0.0;
		this.weight = 0.0;
		numberOfPerson++;
	}
	// Handle full information
	public Person(String lastName, String firstName,double height, double weight){
		this.lastName = lastName;
		this.firstName = firstName;
		this.height = height;
		this.weight = weight;	
		numberOfPerson++;
		
	}
	
	// Accessors
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public static int getNumberOfPerson(){
		return numberOfPerson;
	}
	
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", "
				+ "height=" + height + ", weight=" + weight
				+ "]";
	}
	
	
	
}
