package Tasks;

import java.util.concurrent.Callable;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class MyCallable2 implements Callable<Integer> {

    private final int numberTask;
    private final int numberIteration;

    public MyCallable2(int numberTask, int numberIteration) {
        this.numberTask = numberTask;
        this.numberIteration = numberIteration;
    }

    @Override
    public Integer call() {

        currentThread().setName("поток " + numberTask);

        int count = 0;
        int i = 0;
        try {
            while (i < numberIteration) {
                sleep(3_000);
                System.out.println("Я " + currentThread().getName() + " - Привет!");
                count++;
                i++;
            }
        } catch (InterruptedException e) {

        }
        return count;
    }
}

