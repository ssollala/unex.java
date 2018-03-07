package com.dasol.polymorphism;

public class Student extends Person {
	
	private double gpa;
	private static int numberOfStudents = 0;
	
	public Student(){
		super();
		this.gpa = 0;
		numberOfStudents++;
	}
	public Student(String firstName, String lastName, double height, double weight, double gpa){
		super(firstName, lastName, height, weight);
		this.gpa = gpa;
		numberOfStudents++;
	}

	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(int gpa) { 
		this.gpa = gpa;
	}

	public static int getNumberOfStudents(){
		return numberOfStudents;
	}
	@Override
	public String toString() {
		return "Student [gpa = " + gpa + 
				", last name = " + getLastName()
					+ ", first name =" + getFirstName() 
					+ ", height =" + getHeight() + ", weight = " + getWeight()
					+ ", number of students = " + getNumberOfStudents() + "]";
	}
	
	
}
