package com.dasolkwon.drawshapes2.shapes;

import java.awt.Color;

// process the fill situation
public abstract class BoundedShape extends Shape{
	
	private boolean filled;		// filled shape state

	public BoundedShape(){
		super();
		setFilled(false);
	}
	
	public BoundedShape(int x1, int y1, int x2, int y2, Color color, boolean isFilled){
		super(x1, y1, x2, y2, color);
		setFilled(isFilled);
	}
	
	// bounded shapes getters and setters
	public int getUpperLeftX(){
		return Math.min(getX1(), getX2());
	}

	public int getUpperLeftY(){
		return  Math.min(getY1(), getY2());
	}
	
	public int getWidth(){
		return Math.abs(getX2() - getX1());
	}
	
	public int getHeight()
	{
		return Math.abs(getY2() - getY1());
	}
	
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

}
