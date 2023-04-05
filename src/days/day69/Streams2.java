package days.day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        IntStream.range(0,10).forEach(System.out::println);
        IntStream.range(0,10).skip(4).forEach(System.out::println);
        IntStream.range(10,30).filter(x->x%2==1).forEach(System.out::println); // odd numbers
        IntStream.range(10,30).filter(x->x%2==0).filter(x->x%3==0).forEach(System.out::println); // dividable by 6
        IntStream.range(10,30).filter(x->x%2==0).forEach(System.out::println); // even numbers
//        IntStream.range(0,10).forEach(System.out::println);
        Stream.of("Ali", "Veli","Mahmut").filter(x->x.startsWith("A")).forEach(System.out::println);
        List<Integer> numbers=new ArrayList<>(Arrays.asList(10,20,30,60));

//        Stream.of(numbers).map(x->x+10).forEach(System.out::println);

    }
}
