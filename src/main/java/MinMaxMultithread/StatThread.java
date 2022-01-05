package MinMaxMultithread;

import java.util.List;
import java.util.NoSuchElementException;

public class StatThread implements Runnable {

    private List<Integer> integerList;

    public StatThread(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        Integer max = this.integerList
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        Integer min = this.integerList
                .stream()
                .mapToInt(v -> v)
                .min().orElseThrow(NoSuchElementException::new);
        double avg = this.integerList
                .stream()
                .mapToInt(v -> v)
                .average().orElseThrow(NoSuchElementException::new);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("avg: " + avg);
        System.out.print("execution time: ");
        System.out.println(System.currentTimeMillis() - startTime);
    }
}