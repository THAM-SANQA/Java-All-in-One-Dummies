
package book2.chap2;

import javax.swing.JOptionPane;

/**
 * @author thamsanqa 2024
 **/
public class DialogApp {
    public static void main(String[] args) {
        String s;
        //shows dialogue box as an alert to enter info
        s = JOptionPane.showInputDialog("Enter an Integer: ");
        int x = Integer.parseInt(s);
        System.out.println("You entered " + x + ".");
    }
}
