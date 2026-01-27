/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Things needed for a JavaFX application
 * 1. Must extend Application
 * 2. Main method that calls launch(args)
 * 3. Must override the start method
 * 4. Need a main container (root)
 * 5. Controls are placed inside root's children list
 * 6. Root is placed inside your scene
 * 7. Scene is placed inside your stage
 * 8. Stage is shown
 */
public class JavaFXIntro extends Application {
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        final int dimensions = 400;
        final int spacing = 10;
        VBox root = new VBox(); // main container
        root.setMinWidth(dimensions);
        root.setMinHeight(dimensions);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(spacing);
        Label label = new Label("Hello, World!");
        Button button = new Button("Click Me!");
        root.getChildren().add(label);  // get the list from the root and add the controls
        root.getChildren().add(button); // in the order they should appear
        Scene scene = new Scene(root); // add the main container to the scene
        stage.setScene(scene);  // add the scene to the stage
        stage.show(); // show the stage
    }
}
