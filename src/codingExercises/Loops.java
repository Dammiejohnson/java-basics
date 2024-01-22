package codingExercises;

public class Loops {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count Value is " + count);
            count++;
        }

        System.out.println("===================");

        for (int i = 1; i !=6; i++){
            System.out.println("Count Value is " + i);
        }

        System.out.println("===================");

        count = 1;
        do {
            System.out.println("Count Value is " + count);
            count++;
        }
            while (count != 6 );

    }
}
