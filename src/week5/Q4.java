/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Q4 extends Application {
    static void main() {
        launch();
    }

    @Override
    public void start(Stage stage) {
        HBox pane = new HBox();
        Scene scene;
        TextField tf = new TextField();
        Button b = new Button("Submit");
        b.setOnAction(e -> {
            Button button = (Button) e.getSource();
            button.setText("Save");
        });
        tf.setOnAction(_ -> tf.setText(tf.getText().toUpperCase()));
        pane.getChildren().add(tf);
        scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}
