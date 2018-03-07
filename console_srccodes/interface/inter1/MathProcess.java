package com.pluralsight.calcengine;

public interface MathProcess {
	String SEPERATOR = " ";
    String getKeyword();    // add, divide, ...
    char getSymbol();       // +, /, ....
    double doCalculation(double leftValue, double rightValue);
}
