package days.day31_ReadingUserInput;

import java.util.Scanner;

public class Task5 {
    /*
        Scanner Exercise - 5 / Homework Let's write a guessing game where the user has to guess a secret number
        between 1 - 30: - After every guess, the program tells the user whether their number was too
        large or too small: ie - "12 is too large, please try again!" • The program will keep asking the user to enter the number until he finds the
        correct number. • When the correct answer is found, the program will display "Bravo!!, You
        got the number!!"
                • EXTRA OUTPUT: try to store guess try number and print it like that:
                • "Bravo!!, You got the number in 5 tries !!"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        guessingGame(10, input);
    }
    public static void guessingGame(int n, Scanner input) {
        int count = 1;
        System.out.println("Enter a number between 1-30");
        int number = input.nextInt();

        while (number > 0 && number < 31 && n != number) {

            if (Math.abs(n - number) >= 10) {
                System.out.println(number + " is  cold, please try again!");
                number = input.nextInt();
            } else if (Math.abs(n - number) >= 5) {
                System.out.println(number + " is warm, please try again!");
                number = input.nextInt();
            } else {
                System.out.println(number + " is  hot, please try again!");
                number = input.nextInt();
            }
            count++;
        }
        System.out.println("Bravo!!, You got the number in " + count + " tries !!");

    }

}
