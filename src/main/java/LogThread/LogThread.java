package LogThread;

import LoggerThreads.StatusEnum;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Random;

class LogThread implements Runnable {

    protected static final Random random = new Random();
    protected static final String PATH = "src/main/java/LogThread/log.txt";
    private static final int MAX_SLEEP = 5000;
    private final int id;

    public LogThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Thread.sleep(random.nextInt(MAX_SLEEP));
                writeToFile(createLog("message from " + this.id), PATH);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public String createLog(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(LocalTime.now());
        stringBuilder.append("  ");
        stringBuilder.append("Thread ID: ");
        stringBuilder.append(this.id);
        stringBuilder.append(" ");
        int a = random.nextInt(4);
        stringBuilder.append(StatusEnum.getStatus(a));
        stringBuilder.append(" ");
        stringBuilder.append(message);
        return stringBuilder.toString();
    }

    public boolean writeToFile(String log, String path) {
        try (FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            out.println(log);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
