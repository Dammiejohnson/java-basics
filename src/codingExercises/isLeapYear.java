package codingExercises;

public class isLeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));

    }

    public static boolean isLeapYear(int year){
        if(year > 0 && year <= 9999){
            return ((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0;

        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if(isLeapYear(year) && (month == 2)){
            return 29;
        }
        if((year >= 1 && year <= 9999) && (month >= 1 && month <= 12)){
            // the reason we're only checking for months is because outside of February in the leap year; no matter
            // the year, it's the same amount of days every month for every possible year
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 2:
                    return 28;
                case 4: case 6: case 9: case 11:
                    return 30;
            }
        }

        return -1;
    }
}
