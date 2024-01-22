package arrays;

public class Demo {
    public static void main(String[] args) {

        int nums[][] = new int[3][4];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                nums[i][j] = (int) (Math.random() * 10);
            }

        }
        // the nums.length and nums[i].length is very important for jagged arrays(multidemensional arrays where the  colums of each may differ)
        // the columns of this arrays would be written explictly
        //nums[0] = new int [3]; nums[1] = new int [4]; nums[2] = new int [5];
        //normal for loop

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                System.out.print(nums[i][j] + " " );

            }
            System.out.println();
        }

        System.out.println();

        //enhanced for loops

        for (int n[]: nums) {
            for (int m: n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }


    }
}
