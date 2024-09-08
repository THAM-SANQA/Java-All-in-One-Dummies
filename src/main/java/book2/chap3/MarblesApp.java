
package book2.chap3;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class MarblesApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //declaration
        int numMarbles;
        int numChildren;
        int marblesPerChild;
        int marblesLeft;
        
        //input data
        System.out.println("Welcome to the marble divvy-upper");
        System.out.println("Number of Marbles: ");
        numMarbles = sc.nextInt();
        System.out.println("Number of Children: ");
        numChildren = sc.nextInt();
        
        //results calculation
        marblesPerChild = numMarbles / numChildren;
        marblesLeft = numMarbles % numChildren;
        
        //print results
        System.out.println("Give each child " + marblesPerChild + " marbles");
        System.out.println("You'll have " + marblesLeft + " marbles left over");
        
        
    }
}
