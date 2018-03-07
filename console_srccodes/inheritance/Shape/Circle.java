package com.dasolkwon.a2shapes;

public class Circle extends Shape {

	private final static double PI = 3.14;
	private static double totalCiercleArea = 0;
	private static double totalCirclePerimeter = 0;
	private double radius;
	private static int numbCircles = 0;
	
	// Constructors
	public Circle(){
		this.radius = 0;
		totalCiercleArea += Area();
		totalCirclePerimeter += Perimeter();
		numbCircles++;
	}
	public Circle(double radius){
		this.radius = radius;
		totalCiercleArea += Area();
		totalCirclePerimeter += Perimeter();
		numbCircles++;
	}
	
	// Accessors
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static int getNumbCircles() {
		return numbCircles;
	}
	public static double getTotalArea() {
		return totalCiercleArea;
	}
	public static double getTotalPerimeter() {
		return totalCirclePerimeter;
	}

	// Abstract methods 
	@Override
	public double Area() {
		return PI * radius * radius ;
	}
	@Override
	public double Perimeter() {
		return 2 * PI * radius;
	}
	
	// Override toString method
	@Override
	public String toString() {
		return "Circle   [Radius=" + String.format("%.2f", radius) + 
				", Area=" + String.format("%.2f", Area()) +
				", Perimeter=" + String.format("%.2f", Perimeter()) +
				", Total area of circle(s)=" + String.format("%.2f", getTotalArea()) +
				", Total perimeter of circle(s)=" + String.format("%.2f", getTotalPerimeter()) +
				", Total number of circle(s)=" + numbCircles + 
				", " + super.toString() + "]";
	}
	

}
