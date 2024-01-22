package codingExercises;

public class DecimalComparator{

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        if ( (int) (firstNumber * 1000) == (int) (secondNumber * 1000) ){
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }
}