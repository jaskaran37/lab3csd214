package com.example.jaskaran_lab3_csd_214;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("my hr management jaskaran ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();


    }









public  static double yearearning(double sal){
     double ys=12*sal;
     return ys;

}
}