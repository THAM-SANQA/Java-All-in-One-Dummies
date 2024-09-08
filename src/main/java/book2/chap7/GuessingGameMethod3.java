
package book2.chap7;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class GuessingGameMethod3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do{
        playARound(1, getRandomNum(7, 12));
        }while(askForAnotherRound("Try again?"));
    }
    
    public static void playARound(int min, int max) {
        boolean validInput;
        int num, guess;
        String answer;

        //pick num
        num = getRandomNum(min, max);

        //guess
        System.out.println("\nI'm thinking of a number "
                + "between " + min + " and " + max);
        System.out.print("What do you think it is? ");
        guess = getGuess(min, max);

        //check guess
        if (guess == num) {
            System.out.println("Correct, Well done!");
        } else {
            System.out.println("You're wrong!"
                    + " The number was " + num);
        }
    }

    public static int getRandomNum(int min, int max) {
        return (int) (Math.random() * (max - min +1)) + min;
    }

    public static int getGuess(int min, int max) {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < min) || (guess > max)) {
                System.out.print("I said, between " + min
                        + "and"  + max + ". Try again: ");
            } else {
                return guess;
            }
        }
    }

    public static boolean askForAnotherRound(String prompt) {
        while (true) {
            String answer;
            System.out.print("\n" + prompt + "(Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
