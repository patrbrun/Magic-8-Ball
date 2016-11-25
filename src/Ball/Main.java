package Ball;

import lib.TextIO;

/**
 * Created by pati on 25.11.16.
 */


public class Main {
    public static void main(String[] args) {

        // Asks for the user's name using TextIO.
        String name;
        // Multiline strings
        System.out.print("Hello. \n" + "Don't be scared. \n" + "I am a magic 8 ball and I will answer all your questions about \n" + "Life, \n" + "The universe \n" + "And everything. \n" + "First, tell me, what is your name?");
        name = TextIO.getlnString();

        // Asks for the user's question using TextIO.
        String question;
        System.out.print("Hello " + name + ". What question do you have for me?");
        question = TextIO.getlnString();



    }

    }