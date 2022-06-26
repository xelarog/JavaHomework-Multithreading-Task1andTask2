package Tasks;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        try {
            while (!currentThread().isInterrupted()) {
                sleep(3_000);
                System.out.println("Я " + currentThread().getName() + " - Привет!");
            }
        } catch (InterruptedException e) {

        }
    }
}

