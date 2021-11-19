package HW6;

import java.util.ArrayList;
import java.util.Arrays;

public class Statistics {

    public void calculate() {
        double[] array = createArray();
        System.out.println("Generated array:\n" + Arrays.toString(array)+ "\n");
        System.out.println("Minimum: " + getMinimum(array));
        System.out.println("Maximum: " + getMaximum(array));
        System.out.println("Average: " + getAverage(array));
    }

    public double[] createArray() {
        int size = new ReadInput().readInteger();
        double[] newArray = new double[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = Math.random();
        }
        return newArray;
    }

    public double getMinimum(double[] array){
        double min = array[0];
        for (double element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public double getMaximum(double[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    public double getAverage(double[] array){
        return Arrays.stream(array).average().getAsDouble();
    }

}



