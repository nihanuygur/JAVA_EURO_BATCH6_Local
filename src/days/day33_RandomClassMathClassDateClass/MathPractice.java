package days.day33_RandomClassMathClassDateClass;

import java.util.Random;

public class MathPractice {
    static Random random = new Random();

    public static void main(String[] args) {

        //// MAX

        System.out.println(Math.max(1, 2));
        System.out.println(Math.max(1, 'a'));
        System.out.println(Math.max(4.5, 6.2));
        System.out.println(Math.max(1, 2.0)); // It will run automatically casting to double

        //// MIN

        System.out.println(Math.min(1, 2));
        System.out.println(Math.min(1, 'a'));
        System.out.println(Math.min(4.5, 6.2));
        System.out.println(Math.min(1, 2.0)); // It will run automatically casting to double

        //// ABS

        System.out.println(Math.abs(random.nextInt()));
        byte n = 1;
        Math.abs(n);

        //// ROUNDING

        // CEIL --> ROUND TO UP !!!

        System.out.println("Math.ceil(2.001) = " + Math.ceil(2.001));

        // FLOOR --> ROUND TO DOWN !!!

        System.out.println("Math.floor(2.999) = " + Math.floor(2.999));

        // ROUND

        System.out.println("Math.round(2.2) = " + Math.round(2.2)); // 2
        System.out.println("Math.round(2.5) = " + Math.round(2.5)); // 3
        System.out.println("Math.round(2.9) = " + Math.round(2.9)); // 3


        //// RANDOM

        System.out.println("Math.random() = " + Math.random()); // --> it returns 0.0 <= k < 1.0 - random.nextDouble();

        // Return random int number between a (inclusive) and b (exclusive)
        // a + (int) (Math.random() * b);

        // 50 (inc) - 100 (exc)

        System.out.println("result = " + (50 + (int) (Math.random() * 100)));

        // 0 (inc) - 999 (exc)

        System.out.println("result = " + ((int) (Math.random() * 999)));

        // 5.5 (inc) - 55.5 (exc)

        System.out.println("result = " + (5.5 + (Math.random() * (55.5-5.5))));
    }
}
