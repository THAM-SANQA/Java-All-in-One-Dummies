
package book5.chap1;

/**
 * @author thamsanqa 2024
 **/
public class CountDownClockSync extends Thread {
private int start;
public CountDownClockSync(int start) {
        this.start = start;
    }

    public void run() {
        for(int t = start; t >= 0; t --) {
        System.out.println("T minus " + t);
        }
        try{
        Thread.sleep(1000);
        }catch(InterruptedException e){
            {}
        }
    }
}
