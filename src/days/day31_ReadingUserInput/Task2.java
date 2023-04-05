package days.day31_ReadingUserInput;
import java.util.Scanner;
public class Task2 {
    /*
    Scanner Exercise - 2 (Sum the digits in an integer)
    Write a program that reads an integer between 1 and 999 and adds all the digits in the integer.
For example, if an integer is 981, the sum of all its digits is 18
Hint: Use the % operator to extract digits, and use the / operator to
remove the extracted digit.
For instance, 981 % 10 = 1 and 981 / 10 = 98.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sumOfDigits(input);
        sumOfDigits2(input);
    }
    public  static void sumOfDigits(Scanner input){
        System.out.println("Please, Enter the number between 1-999: ");
        int number = input.nextInt();
        System.out.println("Sum of the digits is: " + (number/100 + (number%100)/10 + number%10) );
    }
    public  static void sumOfDigits2(Scanner input){
        System.out.println("Please, Enter any number");
        int number = input.nextInt();
        int n, sum =0;
        while (number>0){
            n=number%10;
            sum+=n;
            number/=10;

        }
        System.out.println("Sum of the digits is: " + sum );
    }
}
