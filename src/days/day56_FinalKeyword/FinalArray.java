package days.day56_FinalKeyword;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FinalArray {
    public static void main(String[] args) {
        int [] copy = {-1,-2,-3,-4};
        int[] number = {1, 2, 3};
        System.out.println("Arrays.toString(number) = " + Arrays.toString(number));
        number[0]=999;
        System.out.println("Arrays.toString(number) = " + Arrays.toString(number));
        number=copy;
        System.out.println("Arrays.toString(number) = " + Arrays.toString(number));



        final int[] number2 = {1, 2, 3}; // protect to element number, but you can change the values
        System.out.println("Arrays.toString(number2) = " + Arrays.toString(number2));
        number2[0]=999; // no problem
        System.out.println("Arrays.toString(number2) = " + Arrays.toString(number2));
//        number2=copy; // you can't change the length


        final ArrayList<Integer> testList= new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        ArrayList<Integer> copyList= new ArrayList<>();
        copyList.add(111);
        copyList.add(222);
        copyList.add(333);

        testList.remove(0);
        testList.add(1,5);
//        testList=copyList; !! can't  do this it is final !!!


    }
}
