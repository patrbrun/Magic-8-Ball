package main8Ball;/**
 * Created by pati on 10.12.16.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        // Access the App.fxml file
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("/graphicUserInterface/App.fxml"));

        Scene ball = new Scene(root, 500, 600);

        primaryStage.setTitle("Magic 8 Ball by Patricia");
        primaryStage.setScene(ball);
        primaryStage.show();

    }

}
