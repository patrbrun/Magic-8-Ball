package Ball;

import com.sun.org.apache.xpath.internal.SourceTree;
import lib.TextIO;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by pati on 25.11.16.
 */


public class PseudoCode {
    public static void main(String[] args) {

        // User input: name and questions.

        String name;
        System.out.print("Hello. \n" +
                "Don't be scared. \n" +
                "I am a magic 8 ball and I will answer all your questions about \n" +
                "Life, \n" +
                "The universe \n" +
                "And everything. \n" +
                "First, tell me, what is your name? ");
        name = TextIO.getlnString();

        // Asks for the user's question using TextIO.

        String question;
        System.out.print("Hello " + name + ". What question do you have for me? ");
        question = TextIO.getlnString();

        // if (question == null) FIX THIS!
        //   System.out.println("Trying to test my powers, smartypants? You must type a question!");

        // Random method to select answers randomly from 1 to 5.

        Random r = new Random();
        int answer = 1 + r.nextInt(6);
        String response = "";

        // Create answer method here!

        if (answer == 0)
            response = "Yes. Definitely yes. No doubts about it.";
        else if (answer == 1)
            response = "Maybe. You should think about it more.";
        else if (answer == 2)
            response = "The answer is obvious, you can figure it out by yourself.";
        else if (answer == 3)
            response = "Dumb question. Next!";
        else if (answer == 4)
            response = "No, no! Definitely NO!";
        else if (answer == 5)
            response = "Why are you even asking me that? Of course it's a NO!";
        System.out.println(response);

    }


    public static void nextQuestion() {
        System.out.print("Hello! What is your question? ");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();

        // User wants to ask another question

        boolean yesOrNo;
        String nextQuestion;

        boolean anotherQuestion = true;
        while (anotherQuestion) {
            System.out.println("Do you want to ask me another question? Type YES or NO.");
            yesOrNo = TextIO.getlnBoolean();
        }
    }
}

            /**
            if (yesOrNo = "Y") {
                // Use the created answer method here!
                System.out.println("Cool. I think I have time for one more question. What do you want to know?");
                // anotherQuestion = Answer method!
             */

