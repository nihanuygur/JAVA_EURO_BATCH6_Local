package days.day64_Collections;

import days.day52FarukT.A;

import java.util.*;
import java.util.stream.Collectors;

public class SetSample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        // insertion order nor provided
        stringSet.add("Toyota");
        stringSet.add("BMW");
        stringSet.add("Honda");
        stringSet.add("Kia");
        stringSet.add("BMW");
        stringSet.add("toyota");
// stringSet = [Kia, Toyota, toyota, BMW, Honda]

        System.out.println("stringSet = " + stringSet);
        Set<String> setTree = new TreeSet<>(stringSet); // treeSet.addAll(stringSet);
        System.out.println("setTree = " + setTree); //treeSet = [BMW, Honda, Kia, Toyota, toyota] // T (65) < t (97) ASCII table
        //treeSet -> ascending order (a-z / z-a)

        setTree.add("BMW");
        System.out.println("setTree = " + setTree);

//        setTree.get(2);
        Integer[] arrayInt = {1, 2, 3};
        int[] arrayInt2 = {1, 2, 3};
        List<Integer> list = Arrays.stream(arrayInt2).boxed().collect(Collectors.toList());

        // array -> arrayList
        List<Integer> intList = Arrays.asList(arrayInt);
//        List<Integer> intList = List.of(arrayInt);

        // array -> treeSet
        Set<Integer> setInt = Set.of(arrayInt);

        // Set -> List
        List<Integer> list2 = new ArrayList<>(setInt);
//        list2.addAll(setInt);
        System.out.println("list2 = " + list2);

        //Collection -> Array
        Object[] objArray = list2.toArray();

    }
}
