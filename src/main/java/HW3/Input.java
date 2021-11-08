package HW3;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public int readInt(){
        return scanner.nextInt();
    }

    public double readDouble(){
        return scanner.nextDouble();
    }

    public String readString(){
        return scanner.nextLine();

    }


}
