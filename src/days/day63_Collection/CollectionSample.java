package days.day63_Collection;

import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(533);
        list.add(1);
        list.add(2);
        list.add(2223);

        System.out.println("list = " + list);

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.addAll(list); // copy one arraylist to another
        System.out.println("arrayList = " + arrayList);
//        arrayList.clear();
        System.out.println("arrayList.size() = " + arrayList.size());

        // contains

        System.out.println("arrayList.contains(2223) = " + arrayList.contains(2223)); // return type -> boolean
        System.out.println("arrayList.contains(2223) = " + arrayList.contains(2223333));
        System.out.println("arrayList.contains(\"2223\") = " + arrayList.contains("2223"));

        //containsAll

        System.out.println("arrayList.containsAll() = " + arrayList.containsAll(list));

        List<Integer> listMix = new ArrayList<>();

        listMix.add(533);
        listMix.add(1);
        listMix.add(2);
        listMix.add(2223);
        listMix.add(111);
        System.out.println("arrayList.containsAll(listMix) = " + arrayList.containsAll(listMix));
        System.out.println("listMix.containsAll(arrayList) = " + listMix.containsAll(arrayList)); // arrayList > listMix

        // equals

        System.out.println("arrayList.equals(list) = " + arrayList.equals(list));
        Collections.sort(list);
        System.out.println("list = " + list);
        System.out.println("arrayList.equals(list) = " + arrayList.equals(list));

        // hashCode

        // remove
//        list = [1, 2, 533, 2223] remove value 2
        System.out.println("list.remove((Integer) 2) = " + list.remove((Integer) 2)); // returns TRUE // -> with value
        // list.remove(1); -> with index number

        System.out.println("list.remove(5) = " + list.remove(5)); // returns FALSE

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(3);
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
//
//        list1.removeAll(list2);
//        System.out.println("list1 = " + list1);

//        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2));

        Object[] intArray = list1.toArray();
        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));
        // Creating an empty array list
        ArrayList<String> bags = new ArrayList<String>();

        // Add values in the bags list.
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");

        // Creating another array list
        ArrayList<String> boxes = new ArrayList<String>();

        // Add values in the boxes list.
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");

        // Before Applying method print both lists
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);

        // Apply retainAll() method to boxes passing bags as parameter
        boxes.retainAll(bags);

        // Displaying both the lists after operation
        System.out.println("\nAfter Applying retainAll()"+
                " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);

    }
}
