package HW6;

public class Menu {
    boolean flag = true;
    ReadInput input = new ReadInput();
    Fibonacci fibonacci = new Fibonacci();

    public void runMenu(){
        while (flag){
            System.out.println("--------------------------------***-----------------------------------");
            System.out.println("Enter a whole number starting from 1 to calculate a fibonacci number.\n" +
                    "Enter -1 to create array and find minimal, maximal and average values\n" +
                    "Enter 0 (zero) to finish the program:");
            System.out.println("--------------------------------***-----------------------------------");
            int index = input.readInteger();
            if(index == 0){
                flag = false;
            }
            else if(index == -1){
                System.out.println("Enter a size of array: ");
                new Statistics().calculate();
            }
            else{
                int result = fibonacci.returnFibonacci(index);
                System.out.println("Fibonacci number with index " + index + " equals " + result);
            }
        }
    }
}
