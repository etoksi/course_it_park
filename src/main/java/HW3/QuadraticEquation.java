package HW3;

public class QuadraticEquation {

    ScannerNumber scannerNumber = new ScannerNumber();
    public void calculateRoot(){
        System.out.println("Пожалуйста, введите коэффициенты квадратного уравнения a,b,c для уравнения ax^2+bx+c");
        System.out.println("a:");
        double a = scannerNumber.readDouble();
        System.out.println("b:");
        double b = scannerNumber.readDouble();
        System.out.println("c:");
        double c = scannerNumber.readDouble();
        double discriminant = b * b - 4 * a * c;
        if(discriminant < 0){
            System.out.println("У квадратного уравнения нет действительных корней");
        }
        else if(discriminant == 0) {
            double[] roots = new double[1];
            System.out.println("У данного уравнения один корень: " + (-b / (2 * a)));
        }
        else {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("Корень №1 = " +  root1 + ", корень №2 = " + root2);
        }
    }
}
