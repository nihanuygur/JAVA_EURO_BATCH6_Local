package days.day64_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {
        ArrayList<String> bags = new ArrayList<>();

        bags.add("C");
        bags.add("A");
        bags.add("B");

        String[] strArray = {"A", "B", "C", "A"};

        //// frequency
        System.out.println("Collections.frequency(List.of(strArray),\"A\") = " + Collections.frequency(List.of(strArray), "A"));

        //// binarySearch
        System.out.println("Collections.binarySearch(bags,\"B\") = " + Collections.binarySearch(bags, "B"));

        //// sort
        Collections.sort(bags);
        System.out.println("Collections.binarySearch(bags,\"B\") = " + Collections.binarySearch(bags, "B"));

        bags.add("C");
        bags.add("C");
        bags.add("C");
        bags.add("A");
        bags.add("A");
        bags.add("A");
        bags.add("A");
        bags.add("B");
        bags.add("B");
        bags.add("B");
        bags.add("B");
        bags.add("B");
        System.out.println("bags = " + bags);
        System.out.println("Collections.frequency(bags,\"B\") = " + Collections.frequency(bags, "B"));

        Integer[] number= {33,22,11,23,555,2};
//        System.out.println("Collections.max(List.of(number)) = " + Collections.max(List.of(number)));
        List<Integer>numList=List.of(number);

        //// max
        System.out.println("Collections.max(List.of(number)) = " + Collections.max(numList));

        //// reverse

//        Collections.reverse(bags);// we can't use       List<Integer>numList=List.of(number); immutable
        System.out.println("bags = " + bags);
        Collections.reverse(bags);
        System.out.println("bags = " + bags);

        List<String>color=new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");
        System.out.println(color);
        System.out.println(shuffleList(color));
    }
    static List<String> shuffleList(List<String> temp){
         Collections.shuffle(temp);
         return temp;
    }

}
