package days.day39_TwoDimensionalArrays_RaggedArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        //                     row / column number
        /*
            [0] [1] [2] [3] [4]
         [0] 0   0   0   0   0
         [1] 0   0   0   0   0
         [2] 0   0   0   0   0
         [3] 0   0   0   0   0
         [4] 0   0   0   0   0
         */
        System.out.println("Arrays.toString(matrix) = " + Arrays.toString(matrix)); // it doesn't work for multi arrays

        // USE deepToString() to print multi-dimensional Arrays
        System.out.println("Arrays.deepToString(matrix) = " + Arrays.deepToString(matrix));

        matrix[2][1] = 7;
        System.out.println("matrix[2][1] = " + matrix[2][1]);
        System.out.println("matrix[2][1] = " + matrix[2]);
        System.out.println("Arrays.toString(matrix[2]) = " + Arrays.toString(matrix[2]));//row 2 printed [0, 7, 0, 0, 0]

        //int [][] table = new int[3][3];   ----> WAY 1
        // table[0][0] = 1;
        // table[0][1] = 2;
        // table[0][2] = 3;
        // table[1][0] = 4;
        // table[1][1] = 5;
        // table[1][2] = 6;
        // table[2][0] = 7;
        // table[2][1] = 8;
        // table[2][2] = 9;

        int[][] table = {{1, 2, 3}, //      ----> WAY 2
                         {4, 5, 6},
                         {7, 8, 9}};

        System.out.println("Arrays.deepToString(table2) = " + Arrays.deepToString(table)); // all row X column
        System.out.println("Arrays.toString(table[1]) = " + Arrays.toString(table[1])); // row 2
        System.out.println("table[2][1] = " + table[2][1]); // table[2][1] --> 8

        Scanner scanner = new Scanner(System.in);

        int[][] nums = new int[3][3];
        System.out.println("nums.length = " + nums.length); // row number
        System.out.println("nums[1].length = " + nums[1].length); // column number

        int count = 0;

//        for (int i = 0; i < nums.length; i++) { // --> ROW
//            for (int x = 0; x < nums[i].length; x++) { // --> COLUMN
//                System.out.println("Enter " + i + " row number " + x + " column number.");
//                nums[i][x] = scanner.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(nums));

//        count++;
//        nums[i][x] = count;
    }
}
