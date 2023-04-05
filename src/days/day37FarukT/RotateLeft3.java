package days.day37FarukT;

import java.util.Arrays;

public class RotateLeft3 {
    public static void main(String[] args) {

//        Given an array of ints length 3, return an array
//        with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//
//
//        rotateLeft3([1, 2, 3]) → [2, 3, 1]
//        rotateLeft3([5, 11, 9]) → [11, 9, 5]
//        rotateLeft3([7, 0, 0]) → [0, 0, 7]
        int[] nums = {1, 2, 3};// 2 3 1
        //            0  1  2
        //            1  2  0
        int number = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = number;
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }
}
