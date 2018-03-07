package com.dasolkwon.calculator;

// processing logic
public class CalcModel {
	private int calcValue;
	
	public void addNumbers(int first, int second){
		calcValue = first + second;
	}
	
	public int getCalcValue(){
		return calcValue;
	}
}
