package com.dasolkwon.a2shapes;

public class Main {

	public static void main(String[] args) {

		Triangle myTriangle = new Triangle(18.0, 24.0, 30.0);
		Square mySquare = new Square(3.0);
		Rectangle myRec = new Rectangle(12.0, 4.0);
		Pentagon myPentagon = new Pentagon(15.0);
		Circle myCircle = new Circle(4.0);
		Circle unKnownCircle = new Circle();
		
		Shape[] shapes = new Shape[Shape.getNumbShape()];
		shapes[0] = myTriangle;
		shapes[1] = mySquare;
		shapes[2] = myRec;
		shapes[3] =  myPentagon;
		shapes[4] = myCircle;
		shapes[5] = unKnownCircle;
		
		header();
		// Print data on the screen
		for (Shape s : shapes) { 
			System.out.println(s);
		}
	
	}

	public static void header(){
		System.out.println("Shape" + "    Data in Shape");
		
	}

}
