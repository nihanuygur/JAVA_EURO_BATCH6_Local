package days.day43_REVIEW_Week;

import java.util.ArrayList;
import java.util.Arrays;

public class List3 {
    public static void main(String[] args) {
        // create a method
        // print the first and the last elements or the ArrayList
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("10","20","30","40","35","85"));
        printFirstAndLast(numbers);
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red","Blue","White"));
        printFirstAndLast(colors);
        String first = firstElement(colors);
        System.out.println(first);
        int i = sizeOfElement(colors);
        System.out.println(i);

    }

    public static int sizeOfElement(ArrayList<String> list){ // if you want to use with all ArrayList --> (ArrayList list)
        return list.size();
    }
    public static String firstElement(ArrayList<String> s){

        return s.get(0);
    }
    public static void printFirstAndLast(ArrayList<String> s){
        System.out.println("The First element = "+ s.get(0));
        System.out.println("The Last element = "+ s.get(s.size()-1));
    }


}
