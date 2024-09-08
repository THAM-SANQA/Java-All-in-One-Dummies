
package book3.chap4;

/**
 * @author thamsanqa 2024
 **/
public class Ball {

    private double weight;

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void hit() {
        System.out.println("You hit a kilometer!");
    }

}

class BaseBall extends Ball {

    public void Baseball() {
        setWeight(5.125);
    }
    @Override
    public void hit() {
        System.out.println("You tore off the cover!");
        super.hit();
    }
}

class BallApp {
    public static void main(String[] args) {
        BaseBall b1 = new BaseBall();
        b1.hit();
    }
}