
package book2.chap6;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class CarWashApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        char p = s.charAt(0);
        String details = "";
        switch (p) {
            case 'E':
            case 'e':
                details += "\tNew Car Scent, plus ... \n";
            case 'D':
            case 'd':
                details += "\tTire Treatment, plus ... \n";
            case 'C':
            case 'c':
                details
                        += "\tLeather/Vinyl Treatment, plus ... \n";
            case 'B':
            case 'b':
                details += "\tWax, plus ... \n";
            case 'A':
            case 'a':
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
}
