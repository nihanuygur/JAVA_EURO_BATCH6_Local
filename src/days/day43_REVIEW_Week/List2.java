package days.day43_REVIEW_Week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class List2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 5, 15, 25, 50));

        // for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // foreach
        for (Integer i:numbers) {
            System.out.println("i = " + i);
        }

        // iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }

        // short way
        numbers.forEach(System.out::println);






    }
}
