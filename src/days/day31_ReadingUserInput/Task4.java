package days.day31_ReadingUserInput;

import java.util.Scanner;

public class Task4 {
    /*
    Scanner Exercise - 4 (Find the number of years)
    Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the
minutes.
• For simplicity, assume a year has 365 days. Here is a sample run:
Enter the number of minutes: 1000000000 -Enter
1000000000 minutes is approximately 1902 years and 214 days
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        numbersOfYears(input);
    }

    public static void numbersOfYears(Scanner input) {
        System.out.println("Please,Enter the number of minutes: ");
        int num = input.nextInt();
        int mDay, year, day, minute;
        mDay= 24*60;
        year = num / (mDay*365);
        day = num / mDay % 365;
        minute = (num%mDay);
        System.out.print(num + " minutes is approximately "+year+" years and "+day+" days and "+minute + " minutes.");

    }
}