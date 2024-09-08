
package book5.chap1;

import java.util.ArrayList;

/**
 * @author thamsanqa 2024
 **/
public class CountDownApp2 {

    public static void main(String[] args) {
        CountDownClock2 clock = new CountDownClock2(20);
        ArrayList<Runnable> events = new ArrayList<Runnable>();
        events.add(new LaunchEvent2(16,
                "Flood the pad!", clock));
        events.add(new LaunchEvent2(6,
                "Start engines!", clock));
        events.add(new LaunchEvent2(0,
                "Liftoff!", clock));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
}
