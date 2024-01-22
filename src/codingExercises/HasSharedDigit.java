package codingExercises;

public class HasSharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 ||
                secondNumber > 99)) {
            return false;
        }
        int lastDigitOne = firstNumber % 10;
        int firstDigitOne = firstNumber / 10;

        int lastDigitTwo = secondNumber % 10;
        int firstDigitTwo = secondNumber / 10;

        return ((lastDigitOne == lastDigitTwo) ||
                (firstDigitOne == firstDigitTwo) ||
                (lastDigitOne == firstDigitTwo) ||
                (lastDigitTwo == firstDigitOne));
    }
}
