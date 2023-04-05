package days.group1Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Swapping {
    //write a program that can swap the first and last elements of an integer arraylist
//                ex:
//                list = [1,2,3,4,5];
//                output: [5,2,3,4,1];

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int first = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, first);
        System.out.println(list);
        String str = "avakado";
        System.out.println(Arrays.toString(str.split("a")));
    }
}