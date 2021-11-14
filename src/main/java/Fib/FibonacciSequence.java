package Fib;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Enter a whole number to calculate fibonacci number:\n");
        int number = readNumber();
        System.out.println("The fibonacci number with index " + number + " calculated recursive  = " + fibRec(number));
        System.out.println("The fibonacci number with index " + number + " calculated iterative = " + fibIter(number));
    }

    private static int fibIter(int number) {
        int[] fibArray = new int[number + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;
        fibArray[2] = 1;
        for (int i = 2; i <= number; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray[number];
    }

    private static int fibRec(int number) {
        switch (number) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            default:
                System.out.println("Something went wrong");
        }
        return fibRec(number - 1) + fibRec(number - 2);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Please, enter a number:");
        }
        return scanner.nextInt();
    }
}
