package setion3;

public class ConvertToKilograms {
    public static void main(String[] args) {

        int myPoundValue = 15;
        double conversionRate = 0.45359237;
        double myKilogramEquivalent = myPoundValue * conversionRate;

        System.out.println("My Kilogram Equivalent of Pound Value = " + myKilogramEquivalent);
    }
}
