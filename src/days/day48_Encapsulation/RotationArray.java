package days.day48_Encapsulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotationArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = 2;
        // 5 1 2 3 4
        // 4 5 1 2 3
        // 3 4 5 1 2
        int[] newArr = rotation(arr, 1);
        System.out.println("newArr = " + Arrays.toString(newArr));
    }

    public static int[] rotation(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int temp = nums[nums.length-1];
            for (int j = nums.length - 1; j >0 ; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
        return nums;
    }

}
