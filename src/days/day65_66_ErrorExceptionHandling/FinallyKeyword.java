package days.day65_66_ErrorExceptionHandling;

public class FinallyKeyword {
    public static void main(String[] args) {

        System.out.println("Before TRY");

        try {
            System.out.println("IN TRY BLOCK");
        } finally {
            System.out.println("FINALLY BLOCK");
        }

        /////////////////////////

        try { // if try to execute we know finally will always run
            System.out.println("TOP TRY BLOCK");
            System.out.println(1 / 0);
            System.out.println("END TRY BLOCK");
        } catch (ArithmeticException e) {
            System.out.println("INSIDE CATCH BLOCK");
        } finally { // close the doors -> STOP!
            System.out.println("FINALLY BLOCK");
            System.out.println("CLOSE DB CONNECTION!!");
        }
        System.out.println("After TRY");


    }
}
