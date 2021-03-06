package HW3;


public class RunProgram {

    QuadraticEquation equation = new QuadraticEquation();

    private static boolean flag = true;


    public void menu() {
        while (flag) {
            System.out.println("\n------------------------****-----------------------");
            System.out.println("Введите q, чтобы найти корни квадратного уравнения.\n" +
                    " Введите f для того, чтобы вычислить факториал.\n" +
                    " Введите e для завершения");
            System.out.println("------------------------****-----------------------\n");


            switch (new Input().readString()) {
                //Завершение программы:
                case "e" :
                    flag = false;
                    break;
                //Вызов метода поиска квадратных уравнений для объекта класса  QuadraticEquation:
                case "q" :
                    equation.calculateRoot();
                    break;
                //Вызов метода, который предлагает пользователю вести аргумент для вычисления факториала
                case "f" :
                    calculateFactorial();
                    break;
                default :
                    System.out.println("Был введен неверный символ. Повторите, пожалуйста");
                    break;
            }
        }
    }

    private void calculateFactorial() {
        System.out.println("Пожалуйста, введите аргумент для вычесления факториала:");
        int arg = new Input().readInt();
        System.out.println(arg + "! = " + new Factorial().factorialCalc(arg) + "\n");
    }
}
