package HW6;

import java.util.Scanner;

public class ReadInput {

    Scanner scanner = new Scanner(System.in);

    public int readInteger() {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Wrong input. Please, try again!");
        }
        return scanner.nextInt();
    }
}

