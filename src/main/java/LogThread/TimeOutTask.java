package LogThread;

import java.io.*;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

class TimeOutTask extends TimerTask {
    private List<Thread> threads;
    private Timer timer;

    TimeOutTask(List<Thread> threads, Timer timer){
        this.threads = threads;
        this.timer = timer;
    }

    public void run() {
        for (Thread thread:threads) {
            if (thread != null && thread.isAlive()) {
                thread.interrupt();
                timer.cancel();
            }
        }
        try {
            printFileToConsole();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printFileToConsole() throws IOException {

        try (InputStream input = new BufferedInputStream(new FileInputStream(LogThread.PATH))) {
            byte[] buffer = new byte[8192];
            for (int length = 0; (length = input.read(buffer)) != -1; ) {
                System.out.write(buffer, 0, length);
            }
        }
    }
}

