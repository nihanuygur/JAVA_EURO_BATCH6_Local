package days.day42_ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {



      // resizable array ->a dynamic array for storing the elements
        ArrayList<String> animals = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(); // not primitive data !! just wrapper classes

        animals.add("Cat");
        animals.add("Dog");
        //    Cat   Dog
        //     0     1

        // get
        System.out.println("animals.get(0) = " + animals.get(0));
        // Elephant Cat   Dog    they aren't removed, changed the index numbers
        //     0     1     2

        animals.add(0,"Elephant");  // (index number , element) 0-> Elephant 1-> Cat 2-> Dog
        System.out.println("animals.get(0) = " + animals.get(0));
        System.out.println("animals.get(1) = " + animals.get(1));

        // add
        animals.add(0,"Horse");
        // Horse  Elephant Cat   Dog
        //   0       1      2     3
        System.out.println("animals.get(0) = " + animals.get(0));
        System.out.println("animals.get(1) = " + animals.get(1));

        // set
        animals.set(0,"Butterfly"); // changed the element of the index-0   --- delete Horse - set Butterfly
        // Butterfly  Elephant Cat   Dog
        //     0         1      2     3
        System.out.println("animals.get(0) = " + animals.get(0));
        System.out.println("animals.get(1) = " + animals.get(1));

        // contains
        System.out.println("animals.contains(\"Horse\") = " + animals.contains("Horse"));
        System.out.println("animals.contains(\"Dog\") = " + animals.contains("Dog"));

        // indexOf
        System.out.println("animals.indexOf(\"Horse\") = " + animals.indexOf("Horse"));
        System.out.println("animals.indexOf(\"Dog\") = " + animals.indexOf("Dog"));

        animals.add("Cat");
        System.out.println("animals.indexOf(\"Cat\") = " + animals.indexOf("Cat"));

        int [] numbers2 = new int[5];
        // The biggest problem ; can not be changed the size of arrays
        System.out.println("numbers2 = " + numbers2); // [I@28a418fc print it with Arrays.toString !
        System.out.println("animals = " + animals); //  you can print ArrayList like that

        // lastIndexOf
        System.out.println("animals.lastIndexOf(\"Cat\") = " + animals.lastIndexOf("Cat"));
        System.out.println("animals.indexOf(\"Cat\") = " + animals.indexOf("Cat"));

        // clear
//        animals.clear(); // delete all the elements
        System.out.println("animals = " + animals);

        // equals
        ArrayList animals2 = new ArrayList(animals);
        System.out.println("animals.equals(numbers2) = " + animals.equals(numbers2));
        System.out.println("animals.equals(animals2) = " + animals.equals(animals2));

        // clone


        // isEmpty
        System.out.println("animals.isEmpty() = " + animals.isEmpty());

        // remove
        animals.remove("Cat");  // it will return us true -- all the elements of array will be removed
        System.out.println("animals = " + animals);
        animals.remove("Cat");  // it will return us false -- there is no Cat inside
        System.out.println("animals = " + animals);
        System.out.println(animals.remove(1)); // it will return us Elephant which will be removed in index number
        System.out.println("animals = " + animals);

        // size
        System.out.println("animals.size() = " + animals.size()); // length
    }
}
