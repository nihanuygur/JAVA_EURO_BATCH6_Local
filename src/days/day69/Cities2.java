package days.day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cities2 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("real madrid");
        cities.add("sporting lisbon");
        cities.add("weirder bremen");

        // print cities
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("cities = " + cities.get(i).split(" ")[1]);
        }
        cities.stream().map(x -> x.split(" ")[1]).forEach(System.out::println);


        // with Arrays
        int[] nums = {5, 10, 7, 90, 65, 45, 25, 20, 10};
        Arrays.stream(nums).filter(x->x<40).forEach(System.out::println);
        Arrays.stream(nums).map(x->x*x).forEach(System.out::println);
        Arrays.stream(nums).map(x->x*x).filter(n->n<1000).forEach(System.out::println);

    }
}
