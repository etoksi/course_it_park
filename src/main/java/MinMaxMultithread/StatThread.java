package MinMaxMultithread;

import java.util.List;
import java.util.Optional;

public class StatThread implements Runnable {

    private List<Integer> integerList;

    public StatThread(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        Integer max = this.integerList.stream().max(Integer::compare).get();
        Integer min = this.integerList.stream().min(Integer::compare).get();
        double avg = (double) this.integerList.stream().mapToInt(Integer::intValue).sum() /this.integerList.size();
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("avg: " + avg);
        System.out.print("execution time: ");
        System.out.println(System.currentTimeMillis() - start);
    }
}