package HW3;

public class MainMath {

    public static void main(String[] args) {

        ScannerNumber scannerNumber = new ScannerNumber();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Factorial factorial = new Factorial();


        quadraticEquation.calculateRoot();


        System.out.println("Пожалуйста, введите аргумент для вычесления факториала:");
        System.out.println(factorial.factorialCalc(scannerNumber.readInt()));


    }
}
