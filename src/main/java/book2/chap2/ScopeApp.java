
package book2.chap2;

/**
 * @author thamsanqa 2024
 **/
public class ScopeApp {

    static int x;

    public static void main(String[] args) {
        x = 5;
        System.out.println("main: x = " + x);
        myMethod();
    }

    public static void myMethod() {
        int y;
        y = 10;
        if (y == x + 5) {
            int z;
            z = 15;
            System.out.println("myMethod: z = " + z);
        }
        System.out.println("myMethod: y = " + y);
        System.out.println("myMethod: x = " + x);
    }
}
