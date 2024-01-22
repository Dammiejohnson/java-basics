package codingExercises;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(false, 15);
    }
    public static void shouldWakeUp (boolean barking, int hourOfTheDay) {
        System.out.println(hourOfTheDay >= 8 && hourOfTheDay <= 23 && barking);
    }
}
