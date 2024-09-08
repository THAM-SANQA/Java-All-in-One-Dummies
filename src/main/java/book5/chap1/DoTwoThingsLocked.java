
package book5.chap1;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author thamsanqa 2024
 **/
public class DoTwoThingsLocked {

    ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(2);
    CountDownClockLocked clock = new CountDownClockLocked();

    public static void main(String[] args) {
        new DoTwoThingsLocked();
    }

    DoTwoThingsLocked() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }

}

class CountDownClockLocked extends Thread {

    ReentrantLock lock = new ReentrantLock();

    public void run() {
        lock.lock();
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus" + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                {
                }
            }
            lock.unlock();
        }
    }
}
