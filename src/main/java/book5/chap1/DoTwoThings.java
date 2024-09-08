
package book5.chap1;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author thamsanqa 2024
 **/
public class DoTwoThings {

    ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(2);
    CountDownClockNew clock = new CountDownClockNew(20);
    public static void main(String[] args) {
        new DoTwoThings();
    }
    DoTwoThings() {
    //executes clock countdown
    pool.execute(clock);
    pool.execute(clock);
    pool.shutdown();
    }
}
