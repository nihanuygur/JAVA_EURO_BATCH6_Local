package days.day33_RandomClassMathClassDateClass;

import java.util.Random;

public class Task2 {
    /*
Random Class - Program Exercise-2
• Let's create a program to how we would simulate the rolling of two dice until the sum of the dice is 8.
• We can use a Random object to simulate the dice, calling it once for each of the two dice.
• We want to loop until the sum is equal to 8 and we can print the various rolls that come up as we run the simulation.
     */

    // TASK 2
    static Random random = new Random();
    public static void main(String[] args) {
        rollingDice();
    }
    public static void rollingDice() {
        int count = 0;
        int sum = 0;
        do {
            int dice1 = random.nextInt(7 - 1) + 1;
            int dice2 = random.nextInt(7 - 1) + 1;
            sum = dice1 + dice2;
            count++;
            System.out.println(dice1 + " " + dice2);
        } while (sum != 8);

        System.out.println("You got sum 8 at " + count + " attempt!!");
    }
}
