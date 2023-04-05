package days.day43_REVIEW_Week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        // add
        cities.add("Oslo"); // index number is 0
        cities.add("Istanbul"); // index number is 1
        cities.add("London"); // index number is 2
        cities.add("Roma"); // index number is 3
        System.out.println("cities = " + cities);
        cities.add(4,"Madrid"); // index number is 4
        // [Oslo, Istanbul, London, Roma, Madrid]    current size -> 5
        //    0       1        2      3      4
        System.out.println("cities = " + cities);

        cities.add(2,"Ankara");
        // [Oslo, Istanbul, Ankara, London, Roma, Madrid]    current size -> 6
        //    0       1       2       3       4      5
        System.out.println("cities = " + cities);

        // get
        System.out.println("cities.get(0) = " + cities.get(0));

        // size
        System.out.println("cities.size() = " + cities.size());

        // arrays.length  capacity
        // ArrayList.size()  how many current element numbers are there in the ArrayList


        // set
        cities.set(0,"Hamburg");
        System.out.println("cities = " + cities);
        // [Hamburg, Istanbul, Ankara, London, Roma, Madrid]
        //    0          1       2       3       4      5

        // isEmpty
        System.out.println("cities.isEmpty() = " + cities.isEmpty());

        // contains
        System.out.println("cities.contains(\"Roma\") = " + cities.contains("Roma")); // returns boolean

        // indexOf
        System.out.println("cities.indexOf(\"Roma\") = " + cities.indexOf("Roma"));

        // remove
        System.out.println("cities.remove(2) = " + cities.remove(2));
        // [Hamburg, Istanbul, London, Roma, Madrid]
        //    0          1       2       3      4

        System.out.println("cities.remove(2) = " + cities.remove("Roma"));
        // [Hamburg, Istanbul, London, Madrid]
        //    0          1       2       3

        // equals
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,35,85));
        System.out.println("cities.equals(numbers) = " + cities.equals(numbers));
        ArrayList<String> cities2 =new ArrayList<>(cities);
        System.out.println("cities2 = " + cities2);
        System.out.println("cities2.equals(cities) = " + cities2.equals(cities));

        // clear
        cities2.clear(); // size 0
        System.out.println("cities2 = " + cities2); // cities2 = []

        // Collections.sort
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers); // [10, 20, 30, 35, 40, 85]


        Collections.sort(cities);
        System.out.println("cities = " + cities); // [Hamburg, Istanbul, London, Madrid]

        // Collections.reverse
        Collections.reverse(cities);
        System.out.println("cities = " + cities); // [Madrid, London, Istanbul, Hamburg]


        // Collections.replaceAll
        numbers.add(0,10);
        // [10, 10, 20, 30, 35, 40, 85]
        System.out.println("numbers = " + numbers);
        Collections.replaceAll(numbers,10,100);
        // [100, 10, 20, 30, 35, 40, 85]
        System.out.println("numbers = " + numbers);







    }
}
