
package book2.chap2;

import java.util.Scanner;
/**
 * @author thamsanqa 2024
 **/
public class ScannerApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        //allows for inputs
        int x = sc.nextInt();
        System.out.println("You entered " + x + ".");
    }
}
