
package book2.chap3;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class CircleAreaApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the circle area calculator.");
        System.out.println("Enter the circle radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * (r * r);
        System.out.println("The area is " + area);
    }
}
