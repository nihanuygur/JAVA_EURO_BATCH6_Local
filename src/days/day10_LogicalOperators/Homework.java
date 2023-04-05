package days.day10_LogicalOperators;

public class Homework {
    public static void main(String[] args) {


    // write a program to calculate the digit of a 5 digit . (76543)

    int sample = 76543;
    int a = sample % 10;
    int b = sample / 10 % 10;
    int c = sample / 100 % 10;
    int d = sample / 1000 % 10;
    int e = sample / 10000;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);






    // write a program to reverse a 3 - digit number. e.g. - number ; 987 output ; 789

        int number = 987;
        int x = number % 10;
        int y = number / 10 % 10;
        int z = number / 100;

        System.out.println(x * 100 + y * 10 + z);

    }
}
