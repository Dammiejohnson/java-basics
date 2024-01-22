package arrays;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        int [] myIntArray = new int [10];
        //same as
      //  int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};

//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i;
//            System.out.println(i);
//        }
//
//        for (int i : myIntArray){
//            System.out.print(i + " ");
//        }

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
