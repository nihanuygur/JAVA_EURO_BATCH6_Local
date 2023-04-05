package days.day37_Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 20, 30}; // this is the other way for the creating element
        //     index      0  1  2  3      ---> length of this array = 4
        System.out.println("numbers.length = " + numbers.length);  // 4
        System.out.println("numbers[3] = " + numbers[3]); //  for last object
        System.out.println("numbers[numbers.length-1] = " + numbers[numbers.length - 1]); // for last object,dynamic way
//        System.out.println("numbers = " + numbers[5]); // out of exception ERROR!!!
        String[] cities = new String[5];
        cities[0] = "London";
        cities[1] = "Roma";

        System.out.println("cities[4] = " + cities[4]); // default value null will be printed
        int[] nums = new int[]{1, 2, 3, 4};
        nums[0] = 50;
        System.out.println("nums.getClass() = " + nums.getClass());
        System.out.println("cities.getClass() = " + cities.getClass());

    }
}
