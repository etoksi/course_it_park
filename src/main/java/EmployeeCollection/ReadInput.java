package EmployeeCollection;

import java.util.Scanner;

public class ReadInput {

    Scanner scanner = new Scanner(System.in);

    public int readNumber() {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("No such choice in menu. Please, try again");
        }
        return scanner.nextInt();
    }

    public String readText(){
        while (!scanner.hasNextLine()) {
            scanner.next();
        }
        return scanner.nextLine();
    }
}
