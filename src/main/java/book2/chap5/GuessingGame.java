
package book2.chap5;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class GuessingGame {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepPlaying = true;
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) {
            boolean validInput;
            int num, guess;
            String answer;

            //pick random no.
            num = (int) (Math.random() * 10) + 1;

            //get guess
            System.out.println("\nI'm thinking of a number between 1 and 10.");
            System.out.print("What do you think it is?");

            do {
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.println("I said between 1 and 10. Try again: ");
                    validInput = false;
                }

            } while (!validInput);

            //check the guess
            if (guess == num) {
                System.out.println("Correct! Well done!");
            } else {
                System.out.println("Incorrect! The number was " + num);
            }

            //play again
            do {
                System.out.print("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;
                if(answer.equalsIgnoreCase("Y"));
                else if (answer.equalsIgnoreCase("N")){
                keepPlaying = false;
                }else{
                validInput = false;
                }
            } while (!validInput);
            System.out.println("\nThanks for playing!");
        }
    }
}
