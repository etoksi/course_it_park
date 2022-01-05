package Buffer;

public class BufferCopyMain {

    Thread thread = new Thread(new ReadThread());
    public static final String FILE_NAME = "file";

    public static void main(String[] args) {
        Thread thread = new Thread(new ReadThread());
        thread.start();
    }
}
