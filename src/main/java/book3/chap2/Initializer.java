
package book3.chap2;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class Initializer {
    private Scanner sc = new Scanner(System.in);
    //initializer
    public int x;
    {
        System.out.println("In static initializer.");
        System.out.print("Enter the starting value for x: ");
        x = sc.nextInt();
        System.out.println("You entered " + x);
    }
    //constructor
    public Initializer() {
        System.out.println("In constructor now.");
    }
}
