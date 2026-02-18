/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXReview extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Button button = new Button("Click Me");
        button.setOnAction(e -> clicked(e));
        root.getChildren().add(button);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFX Review");
        stage.show();
    }

    private void clicked(ActionEvent e) {
        System.out.println("You clicked me!");
    }
}
