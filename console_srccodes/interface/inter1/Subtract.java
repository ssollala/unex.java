package com.pluralsight.calcengine;

public class Subtract implements MathProcess {

	@Override
	public String getKeyword() {
		return "subtract";
	}

	@Override
	public char getSymbol() {
		return '-';
	}

	@Override
	public double doCalculation(double leftValue, double rightValue) {
		return (leftValue - rightValue);
	}

}
