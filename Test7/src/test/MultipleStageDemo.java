package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btOk = new Button("OK");
        Scene scene = new Scene(btOk,200,500);
        primaryStage.setTitle("MyJavaFx");  //set the stage title
        primaryStage.setScene(scene);  //place the scene in the stage
        primaryStage.show();  //display the stage

        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"),300,500));
        stage.show();
    }
}
