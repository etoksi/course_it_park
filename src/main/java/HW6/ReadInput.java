package HW6;

import java.util.Scanner;

public class ReadInput {

    public int readInteger(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Wrong input. Please, try again!");
        }
        return scanner.nextInt();
    }
}
