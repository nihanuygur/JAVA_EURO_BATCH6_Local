package days.day43_REVIEW_Week;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WrapperList {
    public static void main(String[] args) {
        ArrayList<String> number = new ArrayList<>();
        number.add("10");
        number.add("20");
        number.add("30");
        number.add("5");
        number.add("25");
        number.add("15");
        ArrayList<Integer> realNumbers = new ArrayList<>();

        // get Integer  from number to realNumbers
        for (String s:number){
             realNumbers.add(Integer.valueOf(s));
         }
        System.out.println("realNumbers = " + realNumbers);

        realNumbers.clear();

        number.stream().map(elementOfList->Integer.parseInt(elementOfList)); //.map ->to transform or change any element of the ArrayList
        System.out.println(number);

        number.stream().map(x->Integer.parseInt(x)).forEach(System.out::println); //  print each element

        List<Integer> collect = number.stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList()); // making list
        System.out.println("collect = " + collect);

    }
}
