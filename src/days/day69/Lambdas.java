package days.day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>(Arrays.asList(1,10,20,60,80,4,15,70));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------");

        numbers.stream().forEach(System.out::println);

        Consumer<Integer>consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Hello !");
            }
        };

        numbers.stream().forEach(x-> {
            System.out.print(x);
            System.out.print("--");
            System.out.println(x+10);});





    }
}
