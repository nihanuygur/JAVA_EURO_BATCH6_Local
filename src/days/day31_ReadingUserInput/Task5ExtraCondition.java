package days.day31_ReadingUserInput;

import java.util.Random;
import java.util.Scanner;

public class Task5ExtraCondition {
static  Scanner input = new Scanner(System.in);
static Random random = new Random();
    public static void main(String[] args) {

        guessingGame(1,31);
    }

    public static void guessingGame(int min, int max) {
        int n = random.nextInt(max-min)+min;
        int count = 1;
        int remaining = 4;
        System.out.println("Enter a number between 1-30, you can try 5 times ");
        while (!input.hasNextInt()) {
            input.next();
            System.out.print("Please Enter a valid number between 1-30" + "\nRemaining times: " + remaining);
            count++;
            remaining--;
        }
        //||input>30||input<0
        int number = input.nextInt();
        while (number <= 0 || number > 30) {
            System.out.println("You entered an invalid number, Please Enter a valid number between 1-30");
            number = input.nextInt();
            count++;
            remaining--;
        }
        while (n != number && remaining > 0) {

            if (Math.abs(n - number) >= 10) {
                System.out.println(number + " is  cold, please try again! " + "\nRemaining times: " + remaining);
            } else if (Math.abs(n - number) >= 5) {
                System.out.println(number + " is warm, please try again! " + "\nRemaining times: " + remaining);
            } else {
                System.out.println(number + " is  hot, please try again! " + "\nRemaining times: " + remaining);
            }
            number = input.nextInt();
            count++;
            remaining--;
        }
        if (n == number) {
            System.out.println("Bravo!!, You got the number at " + count + " attempt !!");
        } else if (remaining == 0) {
            System.out.println("You lost !!");
        }
    }
}
