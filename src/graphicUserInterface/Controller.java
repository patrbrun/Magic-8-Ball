package graphicUserInterface;

/**
 * Created by pati on 10.12.16.
 */

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.*;

/**
 * This class is the controller for the interface
 */

public class Controller {

    @FXML
    private Label messageLabel;

    @FXML
    private Button aboutButton;

    @FXML
    private Button dailyMessages;


    public void generateRandom(ActionEvent event) {
        Random randomAnswer = new Random();

        // Array list for answers when the button is clicked

        ArrayList<String> answerList = new ArrayList<>();
        answerList.add("Yes. Definitely yes. No doubts about it.");
        answerList.add("Maybe. You should think about it more.");
        answerList.add("The answer is obvious, you can figure it out by yourself.");
        answerList.add("No, no! Definitely NO!");
        answerList.add("Why are you even asking me that? Of course it's a NO!");

        // Retrieves a random item from the array list

        String random = answerList.get(randomAnswer.nextInt(answerList.size()));

        System.out.println(random);

        // Prints the message on the GUI

        messageLabel.setText(random);
    }

    // Exit button
    public void menuClose(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void aboutButton(ActionEvent event) {
        System.out.println("Created by Patricia Bruno Barbosa - CyberSecurity Engineering - 2016");
    }
        @FXML
        void lotteryNumbers(ActionEvent event){
            for(int counter=0 ; counter < 50 ; counter++)
            {
                System.out.println("Your lucky number is " + counter);
            }

        }
        }


