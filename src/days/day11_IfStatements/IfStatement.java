package days.day11_IfStatements;

public class IfStatement {
    public static void main(String[] args) {
// ONE WAY - IF CONDITION
//      if (boolean - expression ) {
//        statement(s);
//    }

        // I want to check that is my number is positive,
        // if positive pls inform me

        int number = 11;

        if (number > 0){
            //STATEMENT FOR TRUE OPTION !!!!!
            System.out.println("Number " + number + " is positive !!");
            System.out.println("HIIII");
            // Equivalent {} --> if you want, u can write without {},
            // but it will collect first statement to 'if condition', it won't compile second statement
        }
        System.out.println("huyyyy");
        // I want to check that is my number is negative,
        // if positive pls inform me
        if (number < 0){
            //STATEMENT FOR TRUE OPTION !!!!!
            System.out.println("Number " + number + " is negative !!");
            System.out.println("HIIII");
            // Equivalent {} --> if you want, u can write without {},
            // but it will collect first statement to 'if condition', it won't compile second statement
        }


        System.out.println("\n////////////////////////\n");
        int hours = 40;
        double Salary = 9000;
        if (hours > 38) {
            Salary *=1.5;
            System.out.println("Salary = " + Salary);
        }
        System.out.println("\n////////////////////////\n");
/// write an if statement /// if y is grater than 0, then assign 1 to x and print x value.

        int y = 5;
        int x;
        if (y>0){
        x = 1;
        System.out.println("x = " + x);
        }

        System.out.println("\n////////////////////////\n");

/// write an if statement that increases pay by 3% if score is grater than 90
        int score = 95;
        int pay = 6000;
        if (score > 90) {
            pay *=1.03;
            System.out.println("pay = " + pay);
        }

System.out.println("\n////////////////////////\n");

/// write a program that prompts the user t enter an integer (QR give a random integer).
/// if the number is a multiple of 5, the program displays "Hi Five".
//  If the number is a multiple of 2, the program displays "Hi Even".

        int Number = 22;

        if (Number%5==0) {
            System.out.println("Hi Five");

        }

        if (Number%2==0) {
            System.out.println("Hi Even");
        }

        //// write a program, declare int variable user age. then program will show us is
        // then user eligible to vote or not .. (Rule ; vote age >=18)
        int age = 20;

        if (age >= 18){
            System.out.println("Eligible to vote");
        }

        if (age < 18){
            System.out.println("Sorry");
        }






    }
}
