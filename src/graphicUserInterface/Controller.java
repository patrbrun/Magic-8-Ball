package graphicUserInterface;

/**
 * Created by pati on 10.12.16.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.*;

/**
 * This class is the controller for the interface
 */

public class Controller {

    @FXML
   private Label messageLabel;

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
}