
package book5.chap1;

/**
 * @author thamsanqa 2024
 **/
public class LaunchEventNew implements Runnable {

    private String message;

    public LaunchEventNew(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }
}
