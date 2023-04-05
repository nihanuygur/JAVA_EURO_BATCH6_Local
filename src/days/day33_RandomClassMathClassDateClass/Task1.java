package days.day33_RandomClassMathClassDateClass;
import java.util.Random;
public class Task1 {
    /*
    Random Class - Program Exercise-1
    • Write a loop that repeatedly prints random numbers between 0 and 100 until a number above 90 is printed.
    At least one line of output should always be printed, even if the first random number is above 90.
    • Here is a sample execution:
1. Random number: 13
2. Random number: 11
3. Random number: 22
4. Random number: 81
5. Random number: 91
6. STOP! Max number exceeded!!
    Note: Print loop count as well in the end!!
     */
    static Random random = new Random();
    public static void main(String[] args) {

        numbers();
    }
    public static void numbers() {
        int randomNumber = 0;
        int count=0;
        do {
            randomNumber = random.nextInt(100);
            count ++;
            System.out.println("Random number: " + randomNumber);
        } while (randomNumber < 90);

        System.out.println("STOP! Max number exceeded at " + count +" attempt!!");
    }
}
