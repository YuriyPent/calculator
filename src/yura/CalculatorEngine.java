package yura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Created by yurap on 17.10.2017.
 */
public class CalculatorEngine implements ActionListener{
    SimpleCalculator parent;
    char selectedAction = ' '; //+-*/
    double currentResult = 0;

    CalculatorEngine(SimpleCalculator parent){
        this.parent = parent;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedbutton = (JButton) e.getSource();
        String dispFieldText = parent.displatField.getText();
        double displayValue = 0;
        if (!"".equals(dispFieldText)){
            displayValue = Double.parseDouble(dispFieldText);
        }
        Object src = e.getSource();
        if (src == parent.buttonPlus){
            selectedAction = '+';
            currentResult = displayValue;
            parent.displatField.setText("");
        } else if (src == parent.buttonMinus){
            selectedAction = '-';
            currentResult = displayValue;
            parent.displatField.setText("");
        } else if (src == parent.buttonDivide){
            selectedAction = '/';
            currentResult = displayValue;
            parent.displatField.setText("");
        } else if (src == parent.buttonMultiply){
            selectedAction = '*';
            currentResult = displayValue;
            parent.displatField.setText("");
        } else  if (parent.buttonEqual == src){
            if (selectedAction == '+'){
                currentResult += displayValue;
                parent.displatField.setText("" + currentResult);
            } else if (selectedAction == '-'){
                currentResult -= displayValue;
                parent.displatField.setText("" + currentResult);
            } else  if (selectedAction == '/'){
                currentResult /= displayValue;
                parent.displatField.setText("" + currentResult);
            } else if (selectedAction == '*'){
                currentResult *= displayValue;
                parent.displatField.setText("" + currentResult);
            }

        } else {
            String clickedButtonLabel = clickedbutton.getText();
            parent.displatField.setText(dispFieldText+clickedButtonLabel);
        }

    }
}
