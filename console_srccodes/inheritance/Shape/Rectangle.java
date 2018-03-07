package com.dasolkwon.a2shapes;

public class Rectangle extends Shape {

	private double width;
	private double height;
	private static double totalRectangleArea = 0;
	private static double totalRectanglePerimeter = 0;
	private static int numbRectangles = 0;
	
	// Constructors
	public Rectangle(){
		this.width = 0;
		this.height = 0;
		totalRectangleArea += Area();
		totalRectanglePerimeter += Perimeter();
		numbRectangles++;
	}
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
		totalRectangleArea += Area();
		totalRectanglePerimeter += Perimeter();
		numbRectangles++;
	}
	
	// Accessors
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public static int getNumbRectangles(){
		return numbRectangles;
	}
	public static double getTotalArea() {
		return totalRectangleArea;
	}
	public static double getTotalPerimeter() {
		return totalRectanglePerimeter;
	}
	

	
	// Abstract Methods
	@Override
	public double Area() {
		return width * height;
	}

	@Override
	public double Perimeter() {
		return 2*(width + height);
	}
	
	// Override toString method
	@Override
	public String toString() {
		return "Rectangle [Width=" + String.format("%.2f", width) + ", Height=" + String.format("%.2f", height) + 
				", Area=" + String.format("%.2f", Area()) + 
				", Perimeter" + String.format("%.2f", Perimeter()) + 
				", Total area of rectangle(s)=" + String.format("%.2f", getTotalArea()) +
				", Total perimeter of rectangle(s)=" + String.format("%.2f", getTotalPerimeter()) +
				", Total number of rectangle(s)=" + getNumbRectangles() + 
				", " + super.toString() + "]";
	}
	
	

}
