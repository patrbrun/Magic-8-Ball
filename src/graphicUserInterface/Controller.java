package graphicUserInterface;

/**
 * Created by pati on 10.12.16.
 */

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * This class is the controller for the interface
 */

public class Controller implements Initializable {


    @FXML
    private AnchorPane root;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label messageLabel;

    public Controller(ResourceBundle resources) {
        this.resources = resources;
        loadWelcomeScreen();
    }

    public void generateRandom(ActionEvent event) {
        Random randomAnswer = new Random();

        // Array list for answers when the button is clicked

        ArrayList<String> answerList = new ArrayList<>();
        answerList.add("Yes. Definitely yes.");
        answerList.add("Maybe. I need to think about it more.");
        answerList.add("The answer is obvious, you can figure it out by yourself.");
        answerList.add("No. Definitely no!");
        answerList.add("Why are you even asking me that? Of course it's a NO!");

        // Retrieves a random item from the array list

        String random = answerList.get(randomAnswer.nextInt(answerList.size()));
        System.out.println(random);

            messageLabel.setText(random);
        }


    private void loadWelcomeScreen()
    {
        try {
        StackPane pane = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        root.getChildren().setAll(pane);

            // Fade in transition
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), pane);
            // Changes the opacity
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.setCycleCount(1);

            // Fade out transition
            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), pane);
            // Changes the opacity
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);

            fadeIn.play();
            fadeIn.setOnFinished((e)->{
                fadeOut.play();
            });

            fadeOut.setOnFinished((e)-> {

                AnchorPane parent = null;
                try {
                    parent = FXMLLoader.load(getClass().getResource("App.fxml"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                root.getChildren().setAll(parent);

            });


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}