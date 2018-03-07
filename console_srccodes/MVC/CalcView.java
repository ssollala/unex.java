package com.dasolkwon.calculator;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView extends JFrame {
	private JTextField firstNumber = new JTextField(10);
	private JLabel addLabel = new JLabel("+");;
	private JTextField secondNumber = new JTextField(10);
	private JButton sumButton = new JButton("Calculate Sum");
	private JTextField resultNumber = new JTextField(10);
	
	public CalcView(){
		
		this.setTitle("Calculate the Sum fo Two Integers");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 70);
		
		JPanel calcPanel = new JPanel();
		
		calcPanel.add(firstNumber);
		calcPanel.add(addLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(sumButton);
		calcPanel.add(resultNumber);
		
		this.add(calcPanel);
		
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getSeocondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getCalcSum(){
		return Integer.parseInt(resultNumber.getText());
	}
	
	public void setSum(int addResult){
		resultNumber.setText(Integer.toString(addResult));
	}
	
	// add ActionListener to the button
	public void addSumListener(ActionListener listenSumButton){
		sumButton.addActionListener(listenSumButton);
	}
	
	public void showErrorMessage(String message){
		JOptionPane.showMessageDialog(this, message);
	}

	
}
