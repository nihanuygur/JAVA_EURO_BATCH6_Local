package days.day33_RandomClassMathClassDateClass;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    static Scanner scanner = new Scanner(System.in);

    /*
    Random Class - Program Exercise-3
    • Let's create a simple program that picks numbers between 1 and 10 until a particular number comes up.
    We'll use the Random class to construct an object for generating our pseudorandom numbers..
    • Sample Output:
1. This program picks numbers from
2. 1 to 10 until a particular number comes up.
3. Pick a number between 1 and 10-> 3
4. next number = 8
5. next number = 2
6. next number = 3
7. Your number came up after 3 times
    • EXTRA TASK: Add a limit for guess/try for random class... i.e. after 10 guess if still didn't find,
    stop execution, And print fail message.
     */
    // TASK 3
    static Random random = new Random();
    public static void main(String[] args) {
        pickNumber(1, 11, 7);
        pickNumber(50, 100, 57);
    }
    public static void pickNumber(int min, int max, int pick) {

        if (pick <= max && pick >= min) {
            int pseudorandom = 0;
            int count = 0;
            int remaining = 20;

            do {
                pseudorandom = random.nextInt(max - min) + min;
                System.out.println("next number = " + pseudorandom);
                count++;
//                remaining--;
            } while (pseudorandom != pick && --remaining > 0);
            if (remaining == 0) {
                System.out.println("Limit expired, Can not find !! ");
            } else {
                System.out.println("Your number came up after " + count + " times");
            }
        }else {
            System.out.println("Pick number must be between Min-Max Numbers !!");
        }
    }

}
