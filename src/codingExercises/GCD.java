package codingExercises;


public class GCD {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int gcd = 1;
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        for (int factor = 1; (factor <= first) && (factor <= 2); factor++) {
            if (first % factor == 0 && second % factor == 0) {
                gcd = factor;
            }
        }
        return gcd;
    }
}
