package days.day31_ReadingUserInput;

import java.util.Scanner;

public class Task1 {
    /*
    Scanner Exercise - 1 (Convert Celsius to Fahrenheit)
    Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit
    and displays the result.
The formula for the conversion is as follows:
• Fahrenheit = (9 / 5) * Celsius + 32
Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
Here is a sample run:
Enter a degree in Celsius: 43
43 Celsius is 109.4 Fahrenheit
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        convertor(input);
    }

    public static void convertor(Scanner input) {
        System.out.println("Enter a degree in Celsius: ");
        int celsius = input.nextInt();
        double fahrenheit = (celsius * 9.0 / 5) + 32; //double fahrenheit = (double)   9 / 5* celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }

}
