/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventHandling extends Application {
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        FlowPane root = new FlowPane();
        Button button = new Button("Press Me!");
        Button button2 = new Button("No, Press Me!");
        TextField textField = new TextField();
        button.setOnAction(new ButtonHandler());
        button2.setOnAction(new ButtonHandler());
        textField.setOnAction(new TextHandler());
        root.getChildren().addAll(button, button2, textField);
        Scene scene = new Scene(root, 100, 100);
        stage.setScene(scene);
        stage.setTitle("Event Handling");
        stage.show();
    }
}
