package GUI;/**
 * Created by pati on 10.12.16.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene ball = new Scene(root, 800, 500);

        primaryStage.setScene(ball);
        primaryStage.setTitle("Magic 8 Ball, by Patricia");
        primaryStage.show();

    }
}
