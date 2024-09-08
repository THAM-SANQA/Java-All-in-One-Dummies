
package book2.chap8;

/**
 * @author thamsanqa 2024
 **/
public class CrazyWithZeros {

    public static void main(String[] args) {
        try {
            int ans = divideNums(15, 3);
        } catch (Exception e) {
            System.out.println("Tried twice, still didn't work!");
        }
    }

    public static int divideNums(int a, int b) throws Exception {
        int c;
        try {
            c = a / b;
            System.out.println("It worked!");
        } catch (Exception e) {
            System.out.println("Didn't work the first time.");
            c = a / b;
            System.out.println("It worked the second time!");
        }finally {
            System.out.println("Better clean up my mess.");
        }
        System.out.println("It worked after all.");
        return c;
    }
}
