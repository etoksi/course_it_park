package HW6;

import java.util.Arrays;

public class Fibonacci {
    private int[] arrayOfFibonacciNumbers = {0, 1};

    public int returnFibonacci(int index) {
        if (arrayOfFibonacciNumbers.length <= index) {
            arrayOfFibonacciNumbers = Arrays.copyOf(arrayOfFibonacciNumbers, index);
        }
        if (arrayOfFibonacciNumbers[index - 1] != 0 || index == 1) {
            System.out.println("Used value from array.");
            System.out.println(Arrays.toString(arrayOfFibonacciNumbers));
            return arrayOfFibonacciNumbers[index - 1];
        }
        arrayOfFibonacciNumbers[index - 1] = calculateFibonacciNumber(index);
        System.out.println("Calculated recursive. Array was modified: ");
        System.out.println(Arrays.toString(arrayOfFibonacciNumbers));
        return arrayOfFibonacciNumbers[index - 1];
    }

    private int calculateFibonacciNumber(int index) {
        if (index == 1) {
            return 0;
        } else if (index == 2) {
            return 1;
        }
        return calculateFibonacciNumber(index - 1) + calculateFibonacciNumber(index - 2);
    }
}
