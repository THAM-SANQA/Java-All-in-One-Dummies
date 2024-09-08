
package book2.chap4;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class Decisions {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        String y;
        System.out.println("Enter 'yes' if you want to play the game otherwise enter 'no'.\n" +
                "Do you have apples?");
        y = sc.next();

        if(y.equalsIgnoreCase("Yes")) {
            System.out.println("The answer is yes. Next Step.\n");
            System.out.println("Please enter the amount of apple(s) you have: ");
            x = sc.nextInt();
            if (x>0){
                String msg = "You have " + x + " apple" + ((x > 1) ? "s." : ".");
                System.out.println(msg);
            } else if (x==0) {
                System.out.println("You don't have any apples");
            }else {
                System.out.println("You owe me Apples ;-)");
            }
            System.out.println("\nThanks for Playing!");

        }else{
            System.out.println("Bye. Enjoy your day!");
        }


    }
}
