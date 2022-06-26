package Tasks;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        try {
            while (!currentThread().isInterrupted()) {
                sleep(2_500);
                System.out.println("Я " + currentThread().getName() + " - Здравствуйте!");
            }
        } catch (InterruptedException e) {

        }
    }
}

