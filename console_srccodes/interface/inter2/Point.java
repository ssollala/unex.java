package com.dasol.interfaces;

public class Point implements DrawColor {

	// fields
	private int x, y;
	
	// constructor
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// implementation of the method from the interface
	@Override
	public void draw(int color) {
		System.out.println("Drawing " + toString() + " with a color of " + color);
	}

	// Accessors
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
