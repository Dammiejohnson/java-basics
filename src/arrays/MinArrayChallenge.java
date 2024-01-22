package arrays;

import java.util.Scanner;

public class MinArrayChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         int [] myArray = readElements(readInteger());
         int minimumValue = findMin(myArray);
        System.out.println("The minimum number is: " + minimumValue);

    }

    private static int readInteger() {
        System.out.println("Enter count");
        return scanner.nextInt();
    }

    private static int[] readElements(int count){
        int [] array = new int[count];

        for (int i = 0; i< array.length; i++){
            System.out.println("Enter the numbers in the array: \r");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

}
