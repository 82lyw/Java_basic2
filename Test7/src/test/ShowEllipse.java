package test;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

import javafx.scene.effect.DropShadow;
import javafx.scene.Group;

public class ShowEllipse extends Application {
    @Override
    public void start(Stage primaryStage) {

        MyEllipse me = new MyEllipse();
        me.setHeight(100);
        //me.setWidth(200);
        Scene scene = new Scene(me,300,200);

        primaryStage.setTitle("ShowEllipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyEllipse extends Pane {

    private void paint() {
        getChildren().clear();
        for(int i = 0;i < 16;i++) {
            Ellipse e1 = new Ellipse(getWidth() / 2,getHeight() / 2,
                    getWidth() / 2 - 50,getHeight() / 2 - 50);
            e1.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            e1.setFill(Color.GREEN);
            e1.setRotate(i * 180 / 16);
            getChildren().add(e1);
        }
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height) {
        super.setWidth(height);
        paint();
    }
}