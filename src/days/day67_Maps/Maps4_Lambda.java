package days.day67_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maps4_Lambda {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(100,20,5,40,505,10,120));
        // print the numbers that less than 40
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)<40){
                System.out.println("numbers.get(i) = " + numbers.get(i));
            }
        }

        // print the numbers that less than 40
        numbers.stream().filter(x-> x<40).forEach(System.out::println); // lambda // filter ---> if condition is true(like if)

        // make List the numbers that less than 40
        List<Integer> numberGreaterThan40 = numbers.stream().filter(n -> n < 40).collect(Collectors.toList());
        System.out.println("numberGreaterThan40 = " + numberGreaterThan40);

        numbers.stream().map(x-> x%2).forEach(System.out::println); // map ---> no condition, handle parenthesis
        numbers.stream().map(x-> x/10).forEach(System.out::println);


    }
}
