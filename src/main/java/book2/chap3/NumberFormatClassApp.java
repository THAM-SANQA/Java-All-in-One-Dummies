
package book2.chap3;

import java.text.NumberFormat;

/**
 * @author thamsanqa 2024
 **/
public class NumberFormatClassApp {

    static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        printMyAllowance();
        printCostPaintBallGun();
    }

    public static void printMyAllowance() {
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My Allowance is " + cf.format(myAllowance));
    }

    public static void printCostPaintBallGun() {
        double costPaintBallGun = 60.05;
        //cf = NumberFormat.getCurrencyInstance();
        System.out.println("The paintball gun costs  " + cf.format(costPaintBallGun));
    }
}
