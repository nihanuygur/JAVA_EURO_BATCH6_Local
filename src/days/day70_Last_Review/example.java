package days.day70_Last_Review;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example {
    public static void main(String[] args) {
        int [] arrayInt1= {1,2,3};
        List<Integer> list = Arrays.stream(arrayInt1).boxed().collect(Collectors.toList());
        float [] arrayfloat = {1.1f,1.2f};
//        List<Integer> list2 = Arrays.stream(arrayfloat).boxed().collect(Collectors.toList());
//        List<Integer> list2 = Arrays.stream(arrayfloat).boxed().collect(Collectors.toList());

//        @FunctionalInterface


    }
}
