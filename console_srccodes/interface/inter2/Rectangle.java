package com.dasol.interfaces;

public class Rectangle extends Point implements DrawColor{

	private int width, height;
	
	Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle drawn at " + super.toString() + " with " 
				+ "[width=" + width + ", height=" + height + "]";
	}

	// Accessors
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	

}
