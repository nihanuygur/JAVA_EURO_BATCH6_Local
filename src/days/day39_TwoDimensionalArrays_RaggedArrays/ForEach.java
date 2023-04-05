package days.day39_TwoDimensionalArrays_RaggedArrays;

public class ForEach {public static void main(String[] args) {
    int [][] nums = {{1,2,3,4,5,6,},{4,5,6,7,8,9}};
    for (int []  i:nums) {
        for (int  j : i) {
            System.out.println("j = " + j);

        }
    }
}
}

