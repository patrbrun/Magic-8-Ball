package GUI;

/**
 * Created by pati on 10.12.16.
 */

import javafx.event.ActionEvent;

import java.util.*;

/**
 * This class gets is the controller for the interface
 */

public class Controller {


    public void generateRandom(ActionEvent event) {
        Random randomAnswer = new Random();


        // Array list for the answers

        ArrayList<String> answerList = new ArrayList<>();
        answerList.add("Yes. Definitely yes. No doubts about it.");
        answerList.add("Maybe. You should think about it more.");
        answerList.add("The answer is obvious, you can figure it out by yourself.");
        answerList.add("No, no! Definitely NO!");
        answerList.add("Why are you even asking me that? Of course it's a NO!");

        String random = answerList.get(randomAnswer.nextInt(answerList.size()));
        System.out.println(random);


    }
}