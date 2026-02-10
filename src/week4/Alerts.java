/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week4;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Alerts extends Application {
    static void main() {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("User Error");
        alert.setContentText("This is all your fault.");
        alert.show();
    }
}
