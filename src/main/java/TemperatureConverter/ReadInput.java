package TemperatureConverter;

import java.util.Scanner;

public class ReadInput {

    Scanner scanner = new Scanner(System.in);

    public char readTextInput() {
        String input = scanner.nextLine();
        if (Temperatures.containsValue(input)) {
            return input.charAt(0);
        } else {
            System.out.println("No such value");
        }
        return readTextInput();
    }

    public double readNumber() {
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Wrong input. Please, try again!");
        }
        return scanner.nextDouble();
    }
}
