package codingExercises;

public class speedConverter {
    public static void main(String[] args) {
        printConversion(25.42);
    }

    public static long toMilesPerHour (double kilometerPerHour) {
        if(kilometerPerHour < 0) {
            return -1;
        }
      return Math.round((kilometerPerHour/1.609));
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        }
        else {
            long newVariable = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + newVariable + " mi/h");
        }
    }
}
