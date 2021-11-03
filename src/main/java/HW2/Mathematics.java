package HW2;

public class Mathematics {
    public static void main(String[] args) {

        System.out.println("3 + 7 = " + addition(3,7));
        System.out.println("20 - 13 = " + substraction(20,13));
        System.out.println("13 x 6 = " + multiplication(13,6));
        System.out.println("6 : 5 = " + division(6,5));
        System.out.print("12 : 5 without the rest = " + intDivision(12,5) + "; ");
        System.out.println("rest = " + findRest(12,5));

        System.out.println("2 ^ 6 = " + power(2,6));

        System.out.println("(2 + 3) ^ 4 = " + binomialPowFour(2, 3)); // Бином Ньютона 4й степени

    }

    public static int addition(int sum1, int sum2){
        return sum1 + sum2;
    }

    public static int substraction(int sub1, int sub2){
        return sub1 - sub2;
    }

    public static int multiplication(int mul1, int mul2){
        return mul1 * mul2;
    }

    public static  double division(double div1, double div2){

        return div1 / div2;
    }

    public static int intDivision(int div1, int div2){
        return div1/div2;
    }

    public static int findRest(int div1, int div2){
        return div1 % div2;
    }

    public static int power(int arg1, int arg2){
        return (int) Math.pow(arg1, arg2);
    }

    public static int binomialPowFour(int a, int b){
        return power(a,4) + 4 * power(a,3) * b + 6 * power(a,2) * power(b,2) + 4 * a * power(b,3) + power(b,4);
    }



}


