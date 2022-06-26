import Tasks.*;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyRunnable1 myRunnable1 = new MyRunnable1();
        MyRunnable2 myRunnable2 = new MyRunnable2();
        MyRunnable3 myRunnable3 = new MyRunnable3();
        MyRunnable4 myRunnable4 = new MyRunnable4();

        ThreadGroup mainGroup = new ThreadGroup("main group");

        Thread thread1 = new Thread(mainGroup, myRunnable1);
        Thread thread2 = new Thread(mainGroup, myRunnable2);
        Thread thread3 = new Thread(mainGroup, myRunnable3);
        Thread thread4 = new Thread(mainGroup, myRunnable4);

        thread1.setName("поток 1");
        thread2.setName("поток 2");
        thread3.setName("поток 3");
        thread4.setName("поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        sleep(15_000);
        System.out.println("Завершаю все потоки");
        mainGroup.interrupt();
        while (mainGroup.activeCount() != 0) {
        }
        mainGroup.destroy();
    }

}
