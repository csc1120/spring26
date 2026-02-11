/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * A simple class showing how to use multiple stages
 */
public class DifferentStages extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass()
                .getResource("different_stages.fxml"));
        Parent root = loader.load();
        stage.setTitle("Different Stages");
        stage.setScene(new Scene(root));

        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("other.fxml"));
        Stage stage2 = new Stage();
        Parent root2 = loader2.load();
        stage2.setTitle("Other Stage");
        stage2.setScene(new Scene(root2));
        Controller controller = loader.getController();
        controller.setStage(stage2);

        stage.show();
    }
}
