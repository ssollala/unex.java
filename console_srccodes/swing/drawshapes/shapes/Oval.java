package com.dasolkwon.drawshapes2.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends BoundedShape {
	
	public Oval(){
		super();
	}
	
	public Oval(int x1, int y1, int x2, int y2, Color color, boolean isFilled){
		super(x1, y1, x2, y2, color, isFilled);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		
		if(isFilled()){
			g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		}
		else{
			g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		}

	}

}
