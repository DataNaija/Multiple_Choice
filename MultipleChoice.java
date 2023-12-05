package multiplechoice;

import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        String question = "Who is the current president of Nigeria? ";
        String choiceOne = "Obasanjo";
        String choiceTwo = "Ernest";
        String choiceThree = "Tinubu";

        String correctAnswer = choiceThree;

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choice
        System.out.println("Choose one of the following: " + choiceOne + ","
                + choiceTwo + ",or "+ choiceThree+".");

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = scanner.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (correctAnswer.equals(userInput.toUpperCase())){
            System.out.println("Congrats! That's the correct answer ");
        } else{
            System.out.println("You are incorrect. The corect answer is " + correctAnswer);
        }

        // if the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is wrong

    }
}
