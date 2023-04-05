package days.day63_Collection;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        List<Object> colors = new ArrayList<>(List.of("Red", "Green", "Orange", "White", "Black"));
        List<Object> colors2 = new ArrayList<>(List.of("Red", "Green"));


        System.out.println("insertElement(colors, \"Pink\") = " + insertElement(colors, "Pink"));
        //[Pink, Red, Green, Orange, White, Black]

        System.out.println("updateElement(colors, \"Orange\", \"Blue\") = " + updateElement(colors, "Orange", "Blue"));
        //[Pink, Red, Green, Blue, White, Black]

        searchElement(colors2, "Purple");

        System.out.println("extract(colors, 3) = " + extract(colors, 3));
        //[Pink, Red, Green]

        System.out.println("compare(colors,colors2) = " + compare(colors, colors2));
        //[Pink, Red, Green, Blue, White, Black]
        //[Red, Green]
        //[No, Yes, Yes, No, No, No]

        System.out.println("join(colors2,colors) = " + join(colors2, colors));
        //[Red, Green, Pink, Red, Green, Blue, White, Black]


    }

    // QUESTION 1
    public static List<Object> insertElement(List<Object> arr, Object obj) {
        arr.add(0, obj);
        return arr;
    }

    // QUESTION 2
    public static List<Object> updateElement(List<Object> arr, Object out, Object in) {
        int indexOut = arr.indexOf(out);
        arr.set(indexOut, in);
        return arr;
    }

    // QUESTION 3
    public static void searchElement(List<Object> arr, Object obj) {
        if (arr.indexOf(obj) >= 0) {
            System.out.println("Found the element!");
        } else {
            System.out.println("Not found!");
        }
    }

    // QUESTION 4
    public static List<Object> extract(List<Object> arr, int a) {
        List<Object> newL = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            newL.add(arr.get(i));
        }
        //subList -> check !
        return newL;
    }

    // QUESTION 5
    public static List<Object> compare(List<Object> arr, List<Object> arr2) {
        List<Object> newL = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr2.contains(arr.get(i))) {
                newL.add("Yes");
            } else {
                newL.add("No");
            }
        }
        return newL;
    }

    // QUESTION 6
    public static List<Object> join(List<Object> arr, List<Object> arr2) {
        arr.addAll(arr2);
        return arr;
    }


}