package MinMaxMultithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static Random r = new Random();
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        generateArray();
        runOneThread();
        runExecutors();
    }

    private static void runOneThread() throws InterruptedException {
        System.out.println("1 thread");
        Runnable statThread = new StatThread(list);
        Thread thread = new Thread(statThread);
        thread.start();
        thread.join();
    }

    private static void generateArray() {
        for (int i = 0; i < 1000000; i++) {
            list.add(new Random().nextInt(1000));
        }
    }

    private static void runExecutors() {
        System.out.println("multiple threads");
        int maxNumberOfThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(maxNumberOfThreads);
        service.execute(new StatThread(list));
        service.shutdown();
    }
}
