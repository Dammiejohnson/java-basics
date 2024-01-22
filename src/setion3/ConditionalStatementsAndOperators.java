package setion3;

public class ConditionalStatementsAndOperators {
    public static void main(String[] args) {

        double firstNumber = 20.00;
        double secondNumber = 80.00;

        double sumOfFirstAndSecondNumberAndMultiplyBy100 = (firstNumber + secondNumber) * 100;

        double remainder = sumOfFirstAndSecondNumberAndMultiplyBy100 % 40.00;

        boolean zeroValue = (remainder == 0) ? true : false;

        System.out.println(zeroValue);

        if (!zeroValue) {
            System.out.println("Got some remainder");
        }
    }
}
