package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] array = getIntegers(5);
        printArray(sortIntegers(array));

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r" );
        int [] value = new int[number];

        for(int i = 0; i < value.length; i++ ) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " is number " + array[i]);
        }
    }

    public static int[] sortIntegers(int [] array) {
//        int [] sortedArray = new int[array.length];
//        for (int i = 0; i < sortedArray.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[]sortedArray = Arrays.copyOf(array, array.length);
            boolean flag = true;
            int temp;
            while (flag) {
                flag = false;
                for (int i = 0; i < sortedArray.length-1; i++) {
                    if (sortedArray[i] < sortedArray[i + 1]) {
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i + 1];
                        sortedArray[i + 1] = temp;
                        flag = true;

                    }
                }
            }

        return sortedArray;
    }
}
