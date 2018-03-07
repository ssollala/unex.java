package com.dasol.polymorphism;

public class Employee extends Person {
	private int empNumber;
	private double salary;
	private static int numberOfEmployees = 0;
	
	public Employee() { 
		super();
		this.empNumber = 0; 
		this.salary = 0.0;
		numberOfEmployees++;
	  }
	
	public Employee(String lastName, String firstName, int height, int weight, int empNumber, double salary) {
			super(lastName, firstName, height, weight); 
			this.empNumber = empNumber;
			this.salary = salary;
			numberOfEmployees++;
		}
	public double getEmpNumber() { 
		return empNumber;
	}
	public double getSalary() { 
		return salary;
	}
	public void setSalary(double salary) { 
		this.salary = salary;
	}
	public static int getNumEmployees() { 
		return numberOfEmployees;
	}
	
	@Override
	public String toString() {
			return "Employee [empNumber = " + empNumber
		+ ", last name = " + getLastName() + ", first name =" + getFirstName()
		+ ", height =" + getHeight()
		+ ", weight =" + getWeight()
		+ ", salary = " + getSalary()
		+ ", number of employees = " + getNumEmployees() + "]";
				
	}
	
}