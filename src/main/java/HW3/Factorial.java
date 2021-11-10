package HW3;

public class Factorial {

    private int result = 1;

    public int factorialCalc(int arg) {
        if (arg == 0 || arg == 1) {
            return result;
        }
        result *= arg;
        return factorialCalc(arg - 1);
    }


}
