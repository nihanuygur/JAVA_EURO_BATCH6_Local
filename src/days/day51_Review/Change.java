package days.day51_Review;

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        change(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers)); // Arrays mutable

        String str = "Hello World";
        changeString(str);
        System.out.println("str = " + str); //Strings immutable
    }


    public static void change(int[] arr) {
        arr[0] = 10;
    }

    public static void changeString(String str) {
        str = "Hello Ali";
    }
}
