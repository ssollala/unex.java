package com.dasolkwon.drawshapes2.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawArea extends JFrame implements ItemListener, ActionListener{
	
	// Current shapes in application
	private String[] shapes = {"Line", "Rectangle", "Oval", "Triangle", "Right Triangle"};
	
	// Current colors in shapes
	private Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.YELLOW
			, Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.RED};
	
	// Color names associated with color choices
	private String[] colorNames = {"Black", "Blue", "Cyan", "Yellow", "Green", "Magenta", "Orange", "Red"};
	
	// setting up for Windows
	private DrawControlsPanel drawPanel;		// panel that handles the drawing
	private JLabel countLabel;					// label to track number of shapess	
	private JButton clearAllButton;				// button to clear all shapes
	private JButton clearLast;					// button to clear the last drawn shape
	private JCheckBox filledCheckBox;			// check box to toggle filled shapes
	private JComboBox colorChoices;				// combo box for selecting the color
	private JComboBox shapeChoices;				// combo box for selecting shapes
	
	// Constructor
	public DrawArea(){
		// title to draw aread
		super("Draw Shapes");
		
		// create component panel
		JPanel topPanel = new JPanel();
		
		// button to clear shaped drawing
		clearAllButton = new JButton("Clear All");
		clearAllButton.addActionListener(this);
		topPanel.add(clearAllButton);
		
		clearLast = new JButton("Clear Last");
		clearLast.addActionListener(this);
		topPanel.add(clearLast);
		
		// choose colors
		colorChoices = new JComboBox(colorNames);
		colorChoices.addItemListener(this);
		topPanel.add(colorChoices);

		// choose shapes
		shapeChoices = new JComboBox(shapes);
		shapeChoices.addItemListener(this);
		topPanel.add(shapeChoices);
		
		// create a check box to determine whether the shape is filled or not
		filledCheckBox = new JCheckBox("Filled");
		filledCheckBox.addItemListener(this);
		topPanel.add(filledCheckBox);

		// create a label for displaying # of total shapes drawn
		countLabel = new JLabel("(# of Shapes=");
		topPanel.add(countLabel);
		
		// updated as a shape added
		JLabel countShapes = new JLabel("0)");		
		topPanel.add(countShapes);
		
		// add topPanel to the frame
		add(BorderLayout.NORTH, topPanel);
		
		// create a label for the coordinate status bar
		JLabel statusLabel = new JLabel("(0,0)");
					
		// add the status bar at the bottom
		add(statusLabel, BorderLayout.SOUTH);
		
		// create the drawControlsPanel tracking its status bar label and shape count
		drawPanel = new DrawControlsPanel(statusLabel, countShapes);
		
		// add the drawing area to the center
		add(drawPanel);
			
	}

	// handle combobox or checkbox selections
	@Override
	public void itemStateChanged(ItemEvent e) {
			// shape choice
			if(e.getSource() == shapeChoices){
				drawPanel.setShapeType(shapeChoices.getSelectedIndex());
			}
			// choose color
			else if(e.getSource() == colorChoices){
				drawPanel.setDrawingColor(colors[colorChoices.getSelectedIndex()]);
			}
			// shape filled/unfilled
			else if(e.getSource() == filledCheckBox){
				drawPanel.setFilledShape(filledCheckBox.isSelected());
			}
	}
		
	// handle button clicks
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clearAllButton){
			drawPanel.clearAllDrawing();
		}
		else if(e.getSource () == clearLast){
			drawPanel.clearLastShape();
		}
		
	}

	

}
