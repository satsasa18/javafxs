package _11_07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _dkasd extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button bt1 = new Button("load");
        Button bt2 = new Button("Add");
        Button bt3 = new Button("update");
        Button bt4 = new Button("remove");

        VBox vb = new VBox(bt1, bt2, bt3, bt4);
        Scene scene = new Scene(vb, 500, 500);
        primaryStage.setTitle("dlqwe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
