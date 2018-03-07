package com.pluralsight.calcengine;

public class DynamicHelper {
	  private MathProcess[] handlers;

	    public DynamicHelper(MathProcess[] handler){
	        this.handlers = handler;
	    }

	    public String process(String statement){
            // example:
            // IN: add 1.0 2.0
	        // OUT: 1.0 + 2.0 = 3.0

	        String[] parts = statement.split(MathProcess.SEPERATOR);
	        String keyword = parts[0];  // add

	        MathProcess theHandler = null;

	        for(MathProcess handler: handlers){
	            if(keyword.equalsIgnoreCase(handler.getKeyword())){
	                theHandler = handler;
	                break;
	            }
	        }
	        double leftVal = Double.parseDouble(parts[1]);      // 1.0
	        double rightVal = Double.parseDouble(parts[2]);     // 2.0

	        double result = theHandler.doCalculation(leftVal, rightVal);


	        StringBuilder sb = new StringBuilder();
	        sb.append(leftVal);
	        sb.append(' ');
	        sb.append(theHandler.getSymbol());
	        sb.append(' ');
	        sb.append(rightVal);
	        sb.append(" = ");
	        sb.append(result);

	        return sb.toString();

	    }
}
