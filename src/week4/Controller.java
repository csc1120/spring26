/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML private void openOther(ActionEvent event) {
        Button button = (Button) event.getSource();
        if(button.getText().equals("Show Stage")){
            button.setText("Close Stage");
            this.stage.show();

        } else {
            button.setText("Show Stage");
            this.stage.close();
        }

    }
}
