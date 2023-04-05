package days.day31_ReadingUserInput;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age for VOTE check: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote!");
        }else if (age < 18) {
            System.out.println("Sorry, try again! :)");
        }
        System.out.println("Please enter your lucky number;");
        int luckyNumber = input.nextInt();

        System.out.println("luckyNumber = " + luckyNumber);

        input.close(); // best practice to close-- not mandatory!! but use it when u finish reading data from console.
    }
}
