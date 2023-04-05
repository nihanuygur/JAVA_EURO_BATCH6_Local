package days.day37_Arrays;

import java.util.Arrays;

public class CoddingBat2 {
    public static void main(String[] args) {
        
        int [] num = {1,2,3};
        int [] reverse = new int[num.length];
        reverse[0]=num[2];
        reverse[1]=num[1];
        reverse[2]=num[0];
        System.out.println(Arrays.toString(reverse));



                //// try with loopss !!!
        int [] nums = {1,2,3};
        int max = 0;
        if (nums[0] > nums[2]) {
            max= nums[0];
        }else{
            max= nums[2];
        }
        nums[0]=max;
        nums[1]=max;
        nums[2]=max;
        System.out.println(Arrays.toString(nums));


    }

}
