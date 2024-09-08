
package book3.chap7;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author thamsanqa 2024
 **/
public class TickTockStatic {
    //static fields
    private static String tickMsg = "Tick...";
    private static String tockMsg = "Tock...";

    public static void main(String[] args) {
        TickTockStatic t = new TickTockStatic();
        t.go();
    }

    private void go() {
        Timer t = new Timer(1000, new Ticker());
        t.start();
        //display message
        JOptionPane.showMessageDialog(null, "Click OK to exit this program.");
        System.exit(0);
    }

    //***********STATIC INNER CLASS***************
    static class Ticker implements ActionListener {

        private boolean tick = true;

        public void actionPerformed(ActionEvent event) {
            if (tick) {
                System.out.println(tickMsg);
            } else {
                System.out.println(tockMsg);
            }
            //toggle
            tick = !tick;
        }
    }
}
