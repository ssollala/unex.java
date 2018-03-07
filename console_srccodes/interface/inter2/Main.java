package com.dasol.interfaces;

public class Main {

	public static void main(String[] args) {
		
		// Create a drawColors object that is reference to DrawColor
		// this can point any class that derives DrawColor interface
		// Anonymous classes can implement interfaces
		DrawColor[] drawColors = new DrawColor[]{
				new Point(100, 100),
				new Rectangle(1, 1, 20, 30)
		};

		for(int i=0; i<drawColors.length; i++){
			drawColors[i].draw(DrawColor.BLUE); 
		}
	}

}
