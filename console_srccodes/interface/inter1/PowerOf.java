package com.pluralsight.calcengine;

public class PowerOf implements MathProcess {

	@Override
	public String getKeyword() {
		return "power";
	}

	@Override
	public char getSymbol() {
		return '^';
	}

	@Override
	public double doCalculation(double leftValue, double rightValue) {
		return Math.pow(leftValue, rightValue);
	}

}
