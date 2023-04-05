package days.day11_IfStatements;

public class task3 {
    public static void main(String[] args) {
        ///// TASK 3
//      Write a program to checks whether a number is even or odd;
        //one way if statement;
        int number = 22;

        if (number%2==1) {
            System.out.println("Number " + number + " is Odd!");
        }
        if (number%2==0) {
            System.out.println("Number " + number + " is Even!");
        }
        //Two way if-else statement

        if (number%2==1) {
            System.out.println("Number " + number + " is Odd!");
        } else {
            System.out.println("Number " + number + " is Even!");
        }


    }
}
