package Buffer;

import java.io.*;

public class ReadThread implements Runnable{

    private static final String READ_FILE = "src/main/resources/file_to_read.txt";
    private static final String WRITE_FILE = "src/main/resources/file_to_write";

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(READ_FILE))) {
            String line;
            int counter = 1;
            while ((line = br.readLine()) != null) {
                writeToFile((WRITE_FILE + counter + ".txt"), line);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileName, String textLine){
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println(textLine);
            writer.close();
        }
        catch (FileNotFoundException e){
            e.getMessage();
        }
    }
}
