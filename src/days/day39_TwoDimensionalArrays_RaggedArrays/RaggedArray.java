package days.day39_TwoDimensionalArrays_RaggedArrays;

import java.util.Arrays;

public class RaggedArray {
    public static void main(String[] args) {
        int [][] triangleArray =  new int[4][];
        System.out.println("Arrays.deepToString(triangleArray) = " + Arrays.deepToString(triangleArray));
        //                 it didn't give error  [null, null, null, null, null] Automatically initialized
        triangleArray[0] = new int[4];
        triangleArray[1] = new int[3];
        triangleArray[2] = new int[2];
        triangleArray[3] = new int[1];

        System.out.println("Arrays.deepToString(triangleArray) = " + Arrays.deepToString(triangleArray));

        triangleArray[0][2]=7;

        System.out.println("Arrays.deepToString(triangleArray) = " + Arrays.deepToString(triangleArray));

//         triangleArray[2][3] = 6; // row 2 has 2 column, but we try to write 3,ERROR !! ArrayIndexOutOfBoundsException!!
        triangleArray[2][1] = 6;
        for (int i = 0; i < triangleArray.length; i++) { // --> ROW
            for (int x = 0; x < triangleArray[i].length; x++) { // --> COLUMN
                System.out.println("Enter " + i + " row number " + x + " column number.");
            }
        }
        System.out.println(Arrays.deepToString(triangleArray));
        int [][] array = new int[5][6];
        int [] x = {1,2};
        array[0]=x;
        System.out.println("array[0][1] = " + array[0][1]);
        System.out.println("array[0].length = " + array[0].length);
        System.out.println("Arrays.deepToString(array) = " + Arrays.deepToString(array));
        int[][]z={{1,2}};
        System.out.println("Arrays.deepToString(z) = " + Arrays.deepToString(z));
    }
}
