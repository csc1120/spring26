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
import javafx.scene.control.Button;
import javafx.scene.effect.BoxBlur;

public class ButtonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        Button b = (Button) actionEvent.getSource();
        if(b.getEffect() == null) {
            b.setEffect(new BoxBlur());
        } else {
            b.setEffect(null);
        }
    }
}
