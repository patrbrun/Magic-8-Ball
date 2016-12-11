package graphicUserInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pati on 11.12.16.
 */
import java.util.ArrayList;
import java.util.Random;

public class GameWindow extends Frame implements ActionListener {

    private Label labelToUseLater;
    private TextField text;
    private Button button;

    Image ballImage;

    // Main game window

    public GameWindow() {
        setLayout(new FlowLayout());



       text = new TextField("", 20);
       text.setEditable(false);
       add(text);

        button = new Button("Click me to get an answer!");
        add(button);
        button.addActionListener(this);


        // Image ballImage = Toolkit.getDefaultToolkit().createImage("magic8ball.jpg");

        setTitle("Magic 8 Ball by Patricia");
        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        GameWindow app = new GameWindow();
    }

    // Button click event handler
    @Override
    public void actionPerformed(ActionEvent evt) {
        text.setText(generateRandom(evt));
    }
    public String generateRandom(ActionEvent event) {
        Random randomAnswer = new Random();

        // Array list for labelToUseLater when the button is clicked
        ArrayList<String> answerList = new ArrayList<>();
        answerList.add("Yes. Definitely yes.");
        answerList.add("Maybe. I need to think about it more.");
        answerList.add("The answer is obvious, you can figure it out by yourself.");
        answerList.add("No. Definitely no!");
        answerList.add("Why are you even asking me that? Of course it's a NO!");

        // Retrieves a random item from the array list
        String random = answerList.get(randomAnswer.nextInt(answerList.size()));
        System.out.println(random);

         return random;
    }
}