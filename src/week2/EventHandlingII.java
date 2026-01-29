/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 1. Separate class implements EventHandler
 * 2. Private inner class
 * 3. Anonymous inner class
 * 4. lambda expression
 * 5. method reference
 */
public class EventHandlingII extends Application {
    static void main() {
        launch();
    }

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        Button button = new Button("Hello");
        // anonymous inner class
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Hello World");
//            }
//        });
        // lambda - may omit parameter if event is not used in the
        // handler method. Use a _ for the lambda parameter.
        // button.setOnAction(_ -> hello());
        // method reference - requires event parameter
        button.setOnAction(this::hello);
        root.getChildren().add(button);
        final int dimensions = 100;
        Scene scene = new Scene(root, dimensions, dimensions);
        stage.setScene(scene);
        stage.setTitle("Event Handling II");
        stage.show();
    }

    // handler method
    private void hello(ActionEvent event) {
        System.out.println("Hello World");
    }

    // handler method without event
    private void hello() {
        System.out.println("Hello World");
    }

    // private inner class
    // I did not make this static in class, but it should be
    // We will talk about why when we cover LinkedLists
    private static class HelloHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            System.out.println("Hello World");
        }
    }
}
