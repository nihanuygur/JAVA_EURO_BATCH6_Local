package days.day38_Arrays;

import java.util.Arrays;

public class Arrays3L {
    public static void main(String[] args) {
        int[] nums = {10, 20, 5, 15, 25, 70};
        String numsString = Arrays.toString(nums); // {"10","20","5","15",25","70"}
        System.out.println("numsString = " + numsString);
        System.out.println("Arrays.binarySearch(nums,5) = " + Arrays.binarySearch(nums, 5)); // 2 index number of 5
        System.out.println("Arrays.binarySearch(nums,50) = " + Arrays.binarySearch(nums, 50)); // mines number !!!
        int search = 5;
        for (int i = 0 ; i<nums.length;i++){
            if (nums[i]==search){
                System.out.println("Index number of search value = " + i);
            }
        }
        String name ="Nazli";
        name.toLowerCase();
        System.out.println("name = " + name);
        Arrays.sort(nums);  /// Arrays are mutable,changeable
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        System.out.println("Arrays.stream(nums).sum() = " + Arrays.stream(nums).sum());
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        Arrays.stream(nums).forEach(System.out::println);

        int [] nums2 = {10,20,5,15,25,70};
        Arrays.sort(nums2);
        System.out.println("Arrays.equals(nums2,nums) = " + Arrays.equals(nums2, nums));


        Arrays.toString(nums);
        Arrays.binarySearch(nums,5);
        Arrays.sort(nums);
        Arrays.equals(nums2,nums);

        String[] players = {"Ali","Veli","Michael","Stephen", "Austin", "Bahadir"};
        System.out.println("Arrays.binarySearch(players,\"Veli\") = " + Arrays.binarySearch(players, "Bahadir"));
        Arrays.sort(players);
        System.out.println("Arrays.toString(players) = " + Arrays.toString(players));
        String[] players1 = {"Ali","Veli","Michael","Stephen", "Austin", "Bahadir"};
        System.out.println("Arrays.equals(players1,players) = " + Arrays.equals(players1, players)); // false, orders different!!
        Arrays.sort(players1);
        System.out.println("Arrays.equals(players1,players) = " + Arrays.equals(players1, players));
    }
}
