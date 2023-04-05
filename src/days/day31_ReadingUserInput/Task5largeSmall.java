package days.day31_ReadingUserInput;

import java.util.Scanner;

public class Task5largeSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        guessingGame(10, input);
    }
    public static void guessingGame(int n, Scanner input) {
        int count = 1;
        System.out.println("Please, Enter a number between 1-30");
        while (!input.hasNextInt()) {
            input.next();
            System.out.print("Please Enter a valid number between 1-30");
            count++;
        }
        int number = input.nextInt();
        while (number<=0 || number>30){
            System.out.println("You entered an invalid number, Please Enter a valid number between 1-30");
            number = input.nextInt();
            count++;
        }
        while ( n != number) {
            if (n>number) {
                System.out.println(number + " is too small, please try again!");
            } else {
                System.out.println(number + " is too large, please try again!");
            }
            number = input.nextInt();
            count++;
        }
        System.out.println("Bravo!!, You got the number in " + count + " tries !!");
    }
}
