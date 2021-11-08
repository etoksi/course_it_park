package HW3;

public class QuadraticEquation {

    Input input = new Input();
    public void calculateRoot(){
        System.out.println("Пожалуйста, введите коэффициенты квадратного уравнения a,b,c для уравнения ax^2+bx+c");
        System.out.println("a:");
        double a = input.readDouble();
        if(a == 0){
            System.out.println("Первый коэффициент не может быть равен 0. Введите a:");
            return;

        }
        System.out.println("b:");
        double b = input.readDouble();
        System.out.println("c:");
        double c = input.readDouble();
        double discriminant = b * b - 4 * a * c;
        if(discriminant < 0){
            System.out.println("У квадратного уравнения нет действительных корней");
        }
        else if(discriminant == 0) {
            double[] roots = new double[1];
            System.out.println("У данного уравнения один корень: " + (double) Math.round((-b) / (2 * a) * 100) / 100);
        }
        else {
            double root1 = (double) Math.round((-b + Math.pow(discriminant, 0.5)) / (2 * a) * 100) / 100;
            double root2 = (double) Math.round((-b - Math.pow(discriminant, 0.5)) / (2 * a) * 100) / 100;
            System.out.println("Корень №1 = " +  root1 + ", корень №2 = " + root2);
        }
    }
}
