package days.day42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<String> animal = new ArrayList<>(Arrays.asList("Eagle", "Lion", "Horse", "Cat"));
        Integer[] nums = {1, 2, 3, 4, 5};
        ArrayList<Integer> numbers5 = new ArrayList<>(Arrays.asList(nums)); // it accepts wrapper class array
        System.out.println("numbers5 = " + numbers5);

        // even numbers between 0-100

        ArrayList<Integer> evenNum = new ArrayList<>();
        int first = 0;
        int last = 100;
        for (int i = first; i < last; i++) {
            if (i % 2 == 0) {
                evenNum.add(i);
            }
        }
        System.out.println("Even number between " + first + "-" + last + " = " + evenNum);


        ArrayList<Integer> evenNum2 = new ArrayList<>();
        for (int i = first; i < last; i++) {
            if (i % 2 == 0) {
                evenNum2.add(i);
                i++;
            }
        }
        System.out.println("Even number between " + first + "-" + last + " = " + evenNum);

        oddNumbers();
        oddNumbers(0,100);
        System.out.println("evenNumbers(50,80) = " + evenNumbers(50, 80));
    }
    public static void oddNumbers(){
        ArrayList<Integer> oddNum = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                oddNum.add(i);
            }
        }
        System.out.println("Odd numbers between 0-100 = " + oddNum);
    }
    public static void oddNumbers(int first , int last){
        ArrayList<Integer> oddNum = new ArrayList<>();
        for (int i = first; i < last; i++) {
            if (i % 2 == 1) {
                oddNum.add(i);
            }
        }
        System.out.println("Odd numbers between 0-100 = " + oddNum);
    }
    public static ArrayList<Integer> evenNumbers(int first , int last){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = first; i < last; i++) {
            if (i % 2 == 1) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }


}
