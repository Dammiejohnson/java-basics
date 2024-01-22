package codingExercises;

public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean hasTeen = hasTeen(99,19,3);
        boolean isTeen = isTeen(21);

        System.out.println(hasTeen + "  ||  " + isTeen);
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        return (firstAge >= 13 && firstAge <=19) || (secondAge >= 13 && secondAge <= 19)
                || (thirdAge >= 13 && thirdAge <= 19);
    }
    public  static boolean isTeen(int ageOne){
        return  ageOne >= 13 && ageOne <= 19;
    }
}
