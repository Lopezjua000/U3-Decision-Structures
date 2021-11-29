import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Random;

public class QuizGame {


   static int usersAnswer, correctAnswer;
    static String displayProblem = "";

    JPanel panel;
    JButton createProblem, checkAnswer;
    JLabel showProblem, resultLabel;
    JTextField answerInput;
    JRadioButton addition, subtraction, multiplication, division;
    ButtonGroup radios = new ButtonGroup();

    public static void main(String[] args) {

        createProblem();
        getUserAnswer();
        checkAnswer();*/
    }

    public QuizGame(){

    JFrame frame = new JFrame(" Quiz Game ");
    frame.setSize(300, 450);
    frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
    frame.setLocationRelativeTo(null);

    panel = new JPanel();
    addition = new JRadioButton("Addition");
    subtraction = new JRadioButton("Subtraction");
    multiplication = new JRadioButton("Multiplication");
    division = new JRadioButton("Division");

    createProblem = new JButton("Make a problem!");
    showProblem = new JLabel(" PLACE HOLDER");
    answerInput = new JTextField(10);
    checkAnswer = new JButton("CHECK ANSWER");
    resultLabel = new JLabel(" Answer RESULTS");

    addition.setBounds(100,25,200,25);
    subtraction.setBounds(100,50,200,25);
    multiplication.setBounds(100,75,200,25);
    division.setBounds(100,100,200,25);

    createProblem.setBounds(100, 125, 200, 25);
    showProblem.setBounds(100, 150, 200, 25);
    answerInput.setBounds(100, 175, 200, 25);
    checkAnswer.setBounds(100, 200, 200, 25);
    resultLabel.setBounds(100, 225, 200, 25);

    addition.setSelected(true);

    createProblem.addActionListener(new NewProblemButton());

    radios.add(addition);
    radios.add(subtraction);
    radios.add(multiplication);
    radios.add(division);

    panel.setLayout(null);
    panel.add(addition);
    panel.add(subtraction);
    panel.add(multiplication);
    panel.add(division);

    frame.add(panel);
    frame.setVisible(true);

    }

    public static void checkAnswer(){
    if(usersAnswer == correctAnswer){
        JOptionPane.showMessageDialog(null, "You are correct!");

    }else{
        JOptionPane.showMessageDialog(null, "Incorrect, please try again.");

    }
}

    public static void getUserAnswer{

    usersAnswer = input(displayProblem);


}

    public static void createProblem(int choice) {

        int choice = input("Choose: Addition(1), Subtraction(2), Multiplication(3), Division(4)");

        if(choice >= 1){
        if(choice < 5) {

            if (choice == 1) {
                add();

            }
            if (choice == 2) {
                sub();
            }

            if (choice == 3) {
                mult();

            }
            if (choice == 4) {
                div();
            }
        }else{
                System.out.println("Wrong input, restart program");
                System.exit(0);
            }
        }

      }else{
            System.out.println("Wrong input, restart program, try again");
            System.exit(0);
        }


      public static void add(){

        int num1 = random();
        int num2 = random();

        correctAnswer = num1 + num2;
        displayProblem = num1 + " + " + num2;

      }

        public static void sub(){

            int num1 = random();
            int num2 = random();
            correctAnswer = num1 - num2;
            displayProblem = num1 + " - " + num2;

        }

        public static void mult(){

            int num1 = random();
            int num2 = random();
            correctAnswer = num1 * num2;
            displayProblem = num1 + " X " + num2;
        }

        public static void div(){

            int num1 = random();
            int num2 = random();
            correctAnswer = num1 / num2;
            displayProblem = num1 + " / " + num2;

        }

      //HELPER METHODS
      public static int random(){

          Random random = new Random();
          return random.nextInt(20) + 1;
      }
        public static int input(String message) {

            return Integer.parseInt(JOptionPane.showInputDialog(message));


}
