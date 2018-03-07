package com.dasolkwon.a2shapes;

public class Pentagon extends Shape {

	private static int numbPentagons = 0;
	private static double totalPentagonArea = 0;
	private static double totalPentagonPerimeter = 0;
	private final static double PI = 3.14;
	private double side;

	
	// Constructors
	public Pentagon(){
		side = 0;
		totalPentagonArea += Area();
		totalPentagonPerimeter += Perimeter();
		numbPentagons++;
	}
	
	public Pentagon(double side){
		this.side = side;
		totalPentagonArea += Area();
		totalPentagonPerimeter += Perimeter();
		numbPentagons++;
	}
	
	// Accessors
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public static int getNumbPentagons() {
		return numbPentagons;
	}
	
	public static double getTotalArea() {
		return totalPentagonArea;
	}

	public static double getTotalPerimeter() {
		return totalPentagonPerimeter;
	}
	// Abstract methods
	@Override
	public double Area() {
		return (5.0 * Math.pow(side, 2)) / (4.0 * Math.tan(PI /5));
	}

	@Override
	public double Perimeter() {
		return 5 * side;
	}

	// Override toString method
	@Override
	public String toString() {
		return "Pentagon [Side=" + String.format("%.2f", side) + 
						", Area=" + String.format("%.2f", Area()) +
						", Perimeter=" + String.format("%.2f", Perimeter()) +
						", Total area of pentagon(s)=" + String.format("%.2f", getTotalArea()) +
						", Total perimeter of pentagon(s)=" + String.format("%.2f", getTotalPerimeter()) +
						", Total number of pentagon(s)=" + getNumbPentagons() + 
						", " + super.toString() + "]";
	}

}
