
package book2.chap8;

import java.util.*;

/**
 * @author thamsanqa 2024
 **/
public class GetInteger2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int i = getAnInt();
        System.out.println("You entered " + i);
    }

    public static int getAnInt() {
        while (!sc.hasNextInt()) {

            sc.nextLine();
            System.out.println("That's not an integer. Try again: ");
        }
        return sc.nextInt();
    }
}
