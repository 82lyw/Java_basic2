package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application{

    @Override
    public void start(Stage primaryStage) {
        //create a scene and place a button in the scene
        Button btOk = new Button("OK");
        Scene scene = new Scene(btOk,200,500);
        primaryStage.setTitle("MyJavaFx");  //set the stage title
        primaryStage.setScene(scene);  //place the scene in the stage
        primaryStage.show();  //display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
