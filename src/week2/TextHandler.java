/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class TextHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        TextField textField = (TextField) actionEvent.getSource();
        if(textField.getText().equals("Hello")) {
            textField.setText("jinx!");
        } else {
            textField.setText(textField.getText().toUpperCase());
        }
    }
}
