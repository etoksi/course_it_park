package HW6;

import java.util.Arrays;

public class Statistics {

    public void calculate() {
        double[] array = createArray();
        System.out.println("Generated array:\n" + Arrays.toString(array) + "\n");
        System.out.println("Minimum: " + getMinimum(array));
        System.out.println("Maximum: " + getMaximum(array));
        System.out.println("Average: " + getAverage(array));
    }

    public double[] createArray() {
        System.out.println("Enter the size of array:");
        int size = new ReadInput().readInteger();
        if (size < 1) {
            System.out.println("Array should contain at least one element");
            return createArray();
        }
        double[] newArray = new double[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = Math.random();
        }
        return newArray;
    }

    public double getMinimum(double[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public double getMaximum(double[] array) {
        return array[array.length - 1];
    }

    public double getAverage(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        //System.out.println(Arrays.stream(array).average().orElse(Double.NaN));
        return sum / array.length;
    }

}



