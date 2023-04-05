package days.day36_REVIEW_Week9;

import java.util.*; // to import all packages

import static java.lang.Math.*; //If we import static class like that; while we are using this methods,

// we don't need to write class name for example 1.
public class RandomMath {
    public static void main(String[] args) {
        add(10, 200); // method name must be descriptive

        abs(20 - 50); // 1 -- Math.abs()
        System.out.println(max(10, 50.50));
        System.out.println(max(10, 50.50));
        Random random = new Random();
        System.out.println("Random 50-100 = " + random.nextInt(50, 100));

    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }
}
