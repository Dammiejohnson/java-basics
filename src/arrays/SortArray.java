package arrays;

import java.util.Scanner;

public class SortArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value.\r");
        int [] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }



}
