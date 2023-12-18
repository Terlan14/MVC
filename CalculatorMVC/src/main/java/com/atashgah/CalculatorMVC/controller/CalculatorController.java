package com.atashgah.CalculatorMVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.atashgah.CalculatorMVC.model.CalculatorModel;
import com.atashgah.CalculatorMVC.view.CalculatorView;

public class CalculatorController {
	
	private CalculatorModel model;
	
	private CalculatorView view;
	
	public CalculatorController(CalculatorView view,CalculatorModel model) {
		
		this.view=view;
		
		this.model=model;
		
		this.view.addCalculateListener(new CalculateListener());
		
	}
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNumber,secondNumber=0;
			try {
				firstNumber=view.getFirstNumber();
				secondNumber=view.getSecondNumber();
				
				model.addTwoNumbers(firstNumber,secondNumber);
				view.setCalcSolution(model.getCalculationValue());
			}
			catch(Exception ex){
				view.displayErrorMessage("You entered something wrong");
			}
			
		}
		
	}

}
