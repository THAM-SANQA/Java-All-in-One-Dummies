
package book2.chap7;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class GuessingGameMethod2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\nThank you for playing!");
    }

    public static void playARound() {
        boolean validInput;
        int num, guess;
        String answer;

        //pick num
        num = getRandomNum();

        //guess
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess();

        //check guess
        if (guess == num) {
            System.out.println("Correct, Well done!");
        } else {
            System.out.println("You're wrong!"
                    + " The number was " + num);
        }
    }

    public static int getRandomNum() {
        return (int) (Math.random() * 10) + 1;
    }

    public static int getGuess() {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 "
                        + "and 10. Try again: ");
            } else {
                return guess;
            }
        }
    }

    public static boolean askForAnotherRound() {
        while (true) {
            String answer;
            System.out.print("\nPlay again? (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
