package HW3;


public class RunProgram {

    QuadraticEquation equation = new QuadraticEquation();

    private static boolean flag = true;


    public void menu() {
        while(flag){
            System.out.println("\n------------------------****-----------------------");
            System.out.println("""
                    Введите q, чтобы найти корни квадратного уравнения\s
                    Введите f для того, чтобы вычислить факториал
                    Введите e для завершения""");
            System.out.println("------------------------****-----------------------\n");

        }
        switch (new Input().readString()) {
            //Завершение программы:
            case "e" -> flag = false;

            //Вызов метода поиска квадратных уравнений для объекта класса  QuadraticEquation:
            case "q" -> equation.calculateRoot();

            //Вызов метода, который предлагает пользователю вести аоргумент для вычисления факториала
            case "f" -> calculateFactorial();
            default -> System.out.println("Был введен неверный символ. Повторите, пожалуйста");
        }
    }

    private void calculateFactorial() {

        System.out.println("Пожалуйста, введите аргумент для вычесления факториала:");
        int arg = new Input().readInt();
        System.out.println(arg + "! = " + new Factorial().factorialCalc(arg) + "\n");
    }
}
