
package book3.chap2;

import java.text.NumberFormat;

/**
 * @author thamsanqa 2024
 **/
public class OrderApp {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        Order ord1 = new Order(5, 5.9);
        ord1.setUnitPrice(45.99);
        ord1.setQtyOrdered(5);
        
        System.out.println("Order 1 Total: " + cf.format(ord1.getOrderTotal()));
    }
}
