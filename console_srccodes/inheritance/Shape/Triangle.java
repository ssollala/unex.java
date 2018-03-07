package com.dasolkwon.a2shapes;

public class Triangle extends Shape {

	// Fields
	private static int numbTriangle = 0;
	private static double totalTriangleArea = 0;
	private static double totalTrianglePerimeter = 0;
	private double sideA;
	private double sideB;
	private double sideC;
	
	// Constructor with no information
	public Triangle(){
		this.sideA = 0;
		this.sideB = 0;
		this.sideC = 0;
		totalTriangleArea += Area();
		totalTrianglePerimeter += Perimeter();
		numbTriangle++;
	}
	
	// Constructor with basic information
	public Triangle(double sideA, double sideB, double sideC){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		totalTriangleArea += Area();
		totalTrianglePerimeter += Perimeter();
		numbTriangle++;
	}

	// Accessors
	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	public static int getNumbTriangle(){
		return numbTriangle;
	}
	public static double getTotalArea() {
		return totalTriangleArea;
	}

	public static double getTotalPerimeter() {
		return totalTrianglePerimeter;
	}


	// Abstract methods
	@Override
	public double Area() {
		double s = 0.5 * Perimeter();
		return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}

	@Override
	public double Perimeter() {
		return sideA + sideB + sideC;
	}

	// Override toString method
	@Override
	public String toString() {
		return "Triangle [SideA=" + String.format("%.2f", sideA) + 
				", SideB=" + String.format("%.2f", sideB) + 
				", SideC=" + String.format("%.2f", sideC) + 
				", Area=" + String.format("%.2f", Area()) +
				", Perimeter=" + String.format("%.2f", Perimeter()) +
				", Total area of triangle(s)=" + String.format("%.2f", getTotalArea()) +
				", Total perimeter of triangle(s)=" + String.format("%.2f", getTotalPerimeter()) +
				", Total number of triangle(s)=" + getNumbTriangle() + 
				", " + super.toString() + "]";
	}

}
