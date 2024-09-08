
package book4.chap2;

import java.util.Arrays;

/**
 * @author thamsanqa 2024
 **/
public class CopyDemo {

    public static void main(String[] args) {
        int arrayOrig[] = {42, 55, 21};
        int arrNew[] = Arrays.copyOf(arrayOrig, 3);
        printIntArray(arrNew);
    }

    static void printIntArray(int arrNew[]) {
        for (int i : arrNew) {
            System.out.println(i);
            System.out.println(' ');
        }
        System.out.println();
    }
}
