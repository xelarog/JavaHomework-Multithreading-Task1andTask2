import Tasks.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        final ExecutorService threadPool = Executors.newFixedThreadPool(4);

        List<Callable<Integer>> listMyCallable = new ArrayList<>();
        listMyCallable.add(new MyCallable1(1, 7));
        listMyCallable.add(new MyCallable2(2, 5));
        listMyCallable.add(new MyCallable3(3, 6));
        listMyCallable.add(new MyCallable4(4, 4));

        final List<Future<Integer>> taskList = threadPool.invokeAll(listMyCallable);
        System.out.println("Завершаю все потоки");

        List<Integer> resultOfTaskList = new ArrayList<>();
        for (Future<Integer> task : taskList) {
            resultOfTaskList.add(task.get());
        }
        resultOfTaskList.forEach(System.out::println);

        final Integer resultOfTask = threadPool.invokeAny(listMyCallable);
        System.out.println("Задача завершена");

        threadPool.shutdown();

        System.out.println(resultOfTask);
    }
}
