package codingExercises;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12, 32, 42));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if((isValid(firstNumber)) &&
                (isValid(secondNumber)) &&
                (isValid(thirdNumber))){
            firstNumber %= 10;
            secondNumber %= 10;
            thirdNumber %= 10;

            return ((firstNumber == secondNumber)
                    || (firstNumber == thirdNumber)
                    || (secondNumber == thirdNumber));
        }
        return false;
    }
    public static boolean isValid(int number){
        return (number >= 10 && number <= 1000);
    }
}
