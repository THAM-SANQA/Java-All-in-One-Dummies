
package book5.chap1;

import java.util.ArrayList;

/**
 * @author thamsanqa 2024
 **/
public class CountDownAppAbort {

    public static void main(String[] args) {
        CountDownClock2 clock = new CountDownClock2(20);
        ArrayList<Runnable> events = new ArrayList<Runnable>();
        events.add(new LaunchEvent3(16, "Flood the pad!", clock));
        events.add(new LaunchEvent3(6, "Start engines!", clock));
        events.add(new LaunchEvent3(0, "Liftoff!", clock));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
}

class LaunchEvent3 implements Runnable {

    private int start;
    private String message;
    TimeMonitor tm;

    public LaunchEvent3(int start, String message,
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        boolean aborted = false;
        while (!eventDone) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                aborted = true;
            }
            if (tm.getTime() <= start) {
                System.out.println(this.message);
                eventDone = true;
                System.out.println("ABORT!!!!");
                tm.abortCountDown();
            }
            if (Thread.interrupted()) {
                aborted = true;
            }
            if (aborted) {
                System.out.println(
                        "Aborting " + message);
                break;
            }
        }
    }
}
