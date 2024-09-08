
package book3.chap3;

/**
 * @author thamsanqa 2024
 **/
public class CountTestApp {

    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            //instantiating object
            CountTest c1 = new CountTest();
            printCount();
        }
    }

    private static void printCount() {
        System.out.println("There are now "
                + CountTest.getInstanceCount() + " instances of the CountTest class.");
    }
}

class CountTest {

    private static int instanceCount = 0;
    //constructor
    public CountTest() {
        instanceCount++;
    }
    //method
    public static int getInstanceCount() {
        return instanceCount;
    }
}
