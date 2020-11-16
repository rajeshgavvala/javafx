package com.eds;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EDSApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("view/sample.fxml"));
            primaryStage.setTitle("EDS");
            primaryStage.setScene(new Scene(root,420,650));
            primaryStage.show();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
