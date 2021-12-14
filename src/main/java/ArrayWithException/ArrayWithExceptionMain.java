package ArrayWithException;

import java.util.Random;

public class ArrayWithExceptionMain {

    public static void main(String[] args) {

        Random random = new Random();

        String[][] arr1 = new String[5][10];
        String[][] arr2 = new String[4][4];
        String[][] arr3 = new String[4][4];

        fillArray(arr1, random);
        fillArray(arr2, random);
        fillArray(arr3,random);

        arr3[0][0] = "s";

        //*****************Test*****************
        //System.out.println(sumArrayValues(arr1)); // Array 5*10 throws MyArraySizeException
        //System.out.println(sumArrayValues(arr2));// No exception
        System.out.println(sumArrayValues(arr3)); //MyArrayDataException - one of the values can't be converted to int
    }

    private static void fillArray(String[][] arr, Random random) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = String.valueOf(random.nextInt(100));
            }
        }
    }

    public static int sumArrayValues(String[][] array) throws MyArrayDataException{
        checkSize(array);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                }
                catch (IllegalArgumentException e){
                    throw new MyArrayDataException("Unconvertable value at index " +"[" + i + ", " + j+ "]");
                }
            }
        }
        return sum;
    }

    public static void checkSize(String[][] array) {
        if(array.length != 4){
            throw new MyArraySizeException("Array is not 4x4");
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i].length != 4){
                throw new MyArraySizeException("Array is not 4x4");
            }
        }
    }
}
