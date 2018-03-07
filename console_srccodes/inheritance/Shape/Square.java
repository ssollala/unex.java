package com.dasolkwon.a2shapes;

public class Square extends Rectangle {

	private static int numbSquares = 0;
	private static double totalRectangleArea = 0;
	private static double totalRectanglePerimeter = 0;
	
	public Square(){
		super(0, 0);
		totalRectangleArea += Area();
		totalRectanglePerimeter += Perimeter();
		numbSquares++;
	}
	public Square(double side) {
		super(side, side);
		totalRectangleArea += Area();
		totalRectanglePerimeter += Perimeter();
		numbSquares++;
	}

	// Accessors
	public static int getNumbSquares() {
		return numbSquares;
	}
	public static double getTotalArea() {
		return totalRectangleArea;
	}
	public static double getTotalPerimeter() {
		return totalRectanglePerimeter;
	}
	

	// Override toString
	@Override
	public String toString() {
		return "Square   [" + "Side=" + getWidth() +
				", Area=" + String.format("%.2f", Area()) + 
				", Perimeter=" + String.format("%.2f", Perimeter()) + 
				", Total area of square(s)=" + String.format("%.2f", getTotalArea()) +
				", Total perimeter of square(s)=" + String.format("%.2f", getTotalPerimeter()) +
				" , Total number of square(s)=" + getNumbSquares() + 
				", " + super.toString() + "]";
	}
	
	
	
	

}
