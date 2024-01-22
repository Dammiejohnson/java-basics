package codingExercises;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(10000000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid value");
        }
        int megaByteValue = kiloBytes / 1024;
        int remainingKiolByteValue = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaByteValue + " MB and " + remainingKiolByteValue + " KB" );
    }
}
