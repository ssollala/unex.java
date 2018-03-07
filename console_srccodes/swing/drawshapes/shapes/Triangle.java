package com.dasolkwon.drawshapes2.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends BoundedShape {

	public Triangle(){
		super();
	}
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, Color color, boolean isFilled){
		super(x1, y1, x2, y2, color, isFilled);	
	}
	
	@Override
	public void draw(Graphics g) {
		
		int xPoints[] = {getX1(), getX2(), getX1() - (getX2()-getX1())}; 
		int yPoints[] = {getY1(), getY2(), getY2()};
		
		g.setColor(getColor());
		
		if(isFilled()){
			g.fillPolygon(xPoints, yPoints, xPoints.length);
		}
		else{
			g.drawPolygon(xPoints, yPoints, xPoints.length);
		}

	}

	
}
