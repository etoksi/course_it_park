package LogThread;

import java.util.List;
import java.util.Timer;

public class ThreadMain {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new LogThread(1));
        Thread thread2 = new Thread(new LogThread(2));
        Thread thread3 = new Thread(new LogThread(3));
        List<Thread> threadList = List.of(thread1, thread2, thread3);
        Timer timer = new Timer();
        timer.schedule(new TimeOutTask(threadList, timer), 60* 1000L);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
