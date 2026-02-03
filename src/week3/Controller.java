/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week3;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField firstOperand;
    @FXML private TextField secondOperand;
    @FXML private TextField result;

    @FXML private void calculate() {
        int a = Integer.parseInt(firstOperand.getText());
        int b = Integer.parseInt(secondOperand.getText());
        int sum = Calculate.calculate(a, b);
        result.setText(sum + "");
    }
}
