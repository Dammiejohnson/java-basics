package codingExercises;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if(isPrime(i)){
                System.out.println(i + " is a prime number");
                count++;
                if (count == 3){
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n){

        if(n ==1 ){
            return false;
        }

        for (int i = 2; i<= (long) Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
