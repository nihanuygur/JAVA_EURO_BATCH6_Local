package days.day31_ReadingUserInput;
import java.util.Scanner;
public class zzz {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int secretNumber = (int)(Math.random() * 30) + 1;
            while (true) {
                System.out.print("Enter a guess (1-30): ");
                int guess = input.nextInt();

                if (guess > secretNumber)
                    System.out.println(guess + " is too large, please try again!");
                else if(guess < secretNumber)
                    System.out.println(guess + " is too small, please try again!");
                else
                    break;

            }
        }
}
