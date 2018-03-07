package com.dasolkwon.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Coordinate the process between view and model
// view and controller are usually combined but model is independent
public class CalcController {
	private CalcView calcView;
	private CalcModel calcModel;
	
	public CalcController(CalcView calcView, CalcModel calcModel){
		this.calcView = calcView;
		this.calcModel = calcModel;
		
		this.calcView.addSumListener(new SumListener());
		
		
	}
	
	// inner SumListener class that implements ActionLinstenr class for button reaction
	class SumListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				calcModel.addNumbers(calcView.getFirstNumber(), calcView.getSeocondNumber());
				
				calcView.setSum(calcModel.getCalcValue());
				
			}catch(NumberFormatException e1){
				calcView.showErrorMessage("Two Integers are needed for the calculation"
						+ e1);
				
			}
			
		}
		
	}
	
}
