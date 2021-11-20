package HW6;

import java.util.Scanner;

public class ReadInput {

    public int readInteger(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Wrong input. Please, try again!");
        }
        int input = scanner.nextInt();
        if(input >= -1){
            return input;
        }
        else {
            System.out.println("Please enter a value starting from -1");
            return readInteger();
        }
    }
}
