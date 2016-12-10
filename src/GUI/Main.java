package GUI;/**
 * Created by pati on 10.12.16.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        // Access the App.fxml file
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("App.fxml"));

        Scene ball = new Scene(root, 396, 400);

        primaryStage.setTitle("Magic 8 Ball, by Patricia");
        primaryStage.setScene(ball);
        primaryStage.show();

    }
}
