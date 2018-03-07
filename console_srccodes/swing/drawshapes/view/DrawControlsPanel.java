package com.dasolkwon.drawshapes2.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


import com.dasolkwon.drawshapes2.shapes.Shape;
import com.dasolkwon.drawshapes2.shapes.Triangle;
import com.dasolkwon.drawshapes2.shapes.Line;
import com.dasolkwon.drawshapes2.shapes.Oval;
import com.dasolkwon.drawshapes2.shapes.Rectangle;
import com.dasolkwon.drawshapes2.shapes.RightTriangle;

public class DrawControlsPanel extends JPanel {

	private Shape[] shapes;		//shapes to process
	private Shape currentShape;
	private int shapeCount;
	private int shapeType;
	private Color currentColor;
	private boolean filledShape;
	private JLabel statusLabel;		// coordinate of mouse situation
	private JLabel count;
	
	public DrawControlsPanel(JLabel statusLabel, JLabel count) {
		shapes = new Shape[20]; 			// 20 maximum shapes to process
		shapeCount = 0;						// no shapes to initially process
		
		setShapeType(0);					// default shape type
		setDrawingColor(Color.BLACK);		// default color
		setFilledShape(false);				// default fill state
		currentShape = null;
		
		setBackground(Color.WHITE);
		
		// add the mouse listeners
		MouseHandler mouseHandler = new MouseHandler();
		addMouseListener(mouseHandler);
		addMouseMotionListener(mouseHandler);
		
		// set the status label for displaying mouse coordinates and count of shapes
		this.statusLabel = statusLabel;
		this.count = count;
	
	}

	// Draw Shapes
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for(int i=0; i<shapeCount; i++){	
			shapes[i].draw(g);
		}
		
		if(currentShape != null){
			currentShape.draw(g);
		}
	}
	
	// Accessors
	
	// Set shape type to draw
	public void setShapeType(int shapeType) {
		if(shapeType<0 || shapeType>5){
			shapeType = 0;
		}
		
		this.shapeType = shapeType;	
	}
	
	public void setDrawingColor(Color c){
		currentColor = c;
	}
	
	public void clearLastShape(){
		if(shapeCount > 0){
			shapeCount--;
			setShapeCount();
			repaint();
		}
	}
	
	public void clearAllDrawing(){
		shapeCount = 0;
		setShapeCount();
		repaint();
	}
	
	public void setFilledShape(boolean isFilled) {
		filledShape = isFilled;
	}
	
	public int getShapeCount(){
		return this.shapeCount;
	}
	
	public void setShapeCount(){
		count.setText(String.format("%d)", shapeCount));
	}
	
	// Processes JPanel mouse events
	private class MouseHandler extends MouseAdapter 
	implements MouseMotionListener{
		
		public void mousePressed(MouseEvent e){
			if(currentShape != null)
				return;
		
			// process shape
			switch(shapeType){
			case 0:
				currentShape = new Line(e.getX(), e.getY(), 
						e.getX(), e.getY(), currentColor);
				break;
			case 1:
				currentShape = new Rectangle(e.getX(), e.getY(),
						e.getX(), e.getY(), currentColor, filledShape );
				break;
			case 2:
				currentShape = new Oval(e.getX(), e.getY(), 
						e.getX(), e.getY(), currentColor, filledShape);
				break;
			case 3:
				currentShape = new Triangle(e.getX(), e.getY(),
						e.getX(), e.getY(), e.getX(), e.getY(), currentColor, filledShape);
				break;
			case 4: 
				currentShape = new RightTriangle(e.getX(), e.getY(),
						e.getX(), e.getY(), e.getX(), e.getY(), currentColor, filledShape);
				break;
			}
		}
		
		// process shape
		public void mouseReleased(MouseEvent e){
			if(currentShape == null)
				return;
			
			// set the second point on the shape
			currentShape.setX2(e.getX());
			currentShape.setY2(e.getY());
			
			// process shape if room in the array
			if(shapeCount < shapes.length){
				shapes[shapeCount] = currentShape;
				shapeCount++;
				setShapeCount();
			}
				
			currentShape = null;	// clear the temporary drawing shape
			repaint();
			
		}
		
		// update shape based on mouse position
		public void mouseDragged(MouseEvent e){
			if(currentShape != null){
				currentShape.setX2(e.getX());
				currentShape.setY2(e.getY());
				repaint();
			}
			
			mouseMoved(e);	// update status bar
		}
		
		// updates the status bar on mouse move position
		public void mouseMoved(MouseEvent e){
			statusLabel.setText(String.format("(%d,%d)", e.getX(), e.getY()));
		}
	}

}
