package com.dasolkwon.a2shapes;

public abstract class Shape {
	
	private static int numbShapes = 0;
	
	// Constructor
	public Shape(){
		numbShapes++;	
	}

	// Accessor
	public static int getNumbShape(){
		return numbShapes;
	}
	
	// abstract methods
	public abstract double Area();
	public abstract double Perimeter();
	
	// Override toString method
	@Override
	public String toString() {
		return " Shape [Total number of shape objects: " + getNumbShape() + "]";
	}

	
	
	

	
	
}
