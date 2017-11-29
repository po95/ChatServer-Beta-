package com.primary;

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Index extends Application {

    Button button;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Let's C h A t");
        button = new Button();
        button.setText("Submit");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
