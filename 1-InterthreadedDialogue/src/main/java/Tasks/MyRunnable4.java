package Tasks;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class MyRunnable4 implements Runnable {
    @Override
    public void run() {
        try {
            while (!currentThread().isInterrupted()) {
                sleep(2_000);
                System.out.println("Я " + currentThread().getName() + " - Hello!" );
            }
        } catch (InterruptedException e) {

        }
    }
}
