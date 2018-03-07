package com.pluralsight.calcengine;

public class Multiply implements MathProcess {

	@Override
	public String getKeyword() {
		return "multiply";
	}

	@Override
	public char getSymbol() {
		return '*';
	}

	@Override
	public double doCalculation(double leftValue, double rightValue) {
		return (leftValue * rightValue);
	}

}
