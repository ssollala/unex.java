package com.pluralsight.calcengine;

public class Adder implements MathProcess {

	@Override
	public String getKeyword() {
		return "add";
	}

	@Override
	public char getSymbol() {
		return '+';
	}

	@Override
	public double doCalculation(double leftValue, double rightValue) {
		return (leftValue + rightValue) ;
	}

}
