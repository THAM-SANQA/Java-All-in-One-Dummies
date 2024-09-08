
package book3.chap2;

/**
 * @author thamsanqa 2024
 **/
public class Order {

    private double unitPrice;
    private int qtyOrdered;

    //constructors
    public Order(int u, double p) {
        qtyOrdered = u;
        unitPrice = p;
    }

    public Order(int u) {
        qtyOrdered = u;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public double getOrderTotal() {
        return unitPrice * qtyOrdered;
    }

}
