package codingExercises;

public class NumberPalindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome (int number){
        int copyNumber = number;
        int reverseNumber = 0;

        while(copyNumber != 0){
            int lastDigit = copyNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            copyNumber /= 10;
        }
        return (reverseNumber == number);
    }
}
