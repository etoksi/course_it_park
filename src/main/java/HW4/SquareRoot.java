package HW4;

import java.util.Scanner;

public class SquareRoot {


    private static final double ACCURACY = 0.01;

    public static void main(String[] args) {

        calculateRoot();

    }


    public static void calculateRoot() {
        boolean isValid = false;
        double value = 0;
        while (!isValid) {
            System.out.println("Please enter a value");
            value = new Scanner(System.in).nextDouble();
            if (value >= 0) {
                isValid = true;
            } else {
                System.out.println("Неверное значение");
            }
        }

        if (value == 0 || value == 1) {
            System.out.println("Квадратный корень числа " + value + " равен " + value);
        } else {
            for (double i = 1; i < value; i += 0.01) {
                if (value - i * i <= ACCURACY) {
                    double result = (double) Math.round(i * 1000) / 1000;
                    System.out.println("Квадратный корень числа " + value + " равен " + result);
                    System.out.println("Проверка: " + result + " * " + result + " = " + result * result +
                            ", погрешность вычисления: " + (value - result * result));
                    return;

                }

            }

        }
    }
}
