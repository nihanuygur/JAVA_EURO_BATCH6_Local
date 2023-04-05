package days.day11_IfStatements;

public class task2 {
    public static void main(String[] args) {
        // TASK 2
//      Write a Java program to find max number for given numbers (positive)
//      1. number: 11
//      2. number: 1
//      3. number: 33
//      OUTPUT  The max number is: 33
//      Try to solve this question with 1 way if statement then try to use if-else ...

        int number1 = 11;
        int number2 = 1;
        int number3 = 33;

        //one way if statement;
        if (number1> number2 && number1 > number3) {
            System.out.println("The max number is: " + number1);
        }
        if (number2> number1 && number2 > number3) {
            System.out.println("The max number is: " + number2);
        }
        if (number3> number2 && number3 > number1) {
            System.out.println("The max number is: " + number3);
        }

        //Two way if-else statement
        if (number1> number2 && number1 > number3) {
            System.out.println("The max number is: " + number1);
        }
        if (number2> number1 && number2 > number3) {
            System.out.println("The max number is: " + number2);
        } else {
            System.out.println("The max number is: " + number3);
        }
    }
}
