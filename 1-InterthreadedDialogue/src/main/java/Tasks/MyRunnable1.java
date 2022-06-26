package Tasks;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        try {
            while (!currentThread().isInterrupted()) {
                sleep(2_000);
                System.out.println("Я " + currentThread().getName() + " - Hi");
            }
        } catch (InterruptedException e) {

        }
    }
}
