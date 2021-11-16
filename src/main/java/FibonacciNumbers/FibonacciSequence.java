package FibonacciNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Enter a whole number n bigger than 0 to calculate fibonacci number with index n:\n");
        int number = readNumber();
        System.out.println("The fibonacci number with index " + number + " calculated recursive = " + fibonacciRecursive(number));
        System.out.println("The fibonacci number with index " + number + " calculated iterative = " + fibonacciIterative(number));
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Please, enter a number:");
        }
        int number = scanner.nextInt();
        if(number > 0) {
            return number;
        }
        System.out.println("Number can't be less than 1. Try again.");
        return readNumber();
    }

    private static int fibonacciRecursive(int number) {
        switch (number) {
            case 1:
                return 0;

            case 2:
            case 3:
                return 1;
            //default здесь смысла не имеет, так как мы проверяем значение при чтении файла с консоли
            //SonarLint страшно ругается на его отсутствие, но он тут очевидно не имеет смысла
        }
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }

    private static long fibonacciIterative(int number) {
        number--;
        ArrayList<Integer> listOfFibonacciNumbers = new ArrayList<>();
        listOfFibonacciNumbers.add(0);
        listOfFibonacciNumbers.add(1);
        for (int i = 2; i <= number; i++) {

            listOfFibonacciNumbers.add(listOfFibonacciNumbers.get(i-1) + listOfFibonacciNumbers.get(i-2));
            }

        return listOfFibonacciNumbers.get(number);
    }
}
