package com.atashgah.CalculatorMVC;

import com.atashgah.CalculatorMVC.controller.CalculatorController;
import com.atashgah.CalculatorMVC.model.CalculatorModel;
import com.atashgah.CalculatorMVC.view.CalculatorView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculatorView view=new CalculatorView();
        
        CalculatorModel model=new CalculatorModel();
        
        CalculatorController controller=new CalculatorController(view,model);
        
        view.setVisible(true);
    }
}
