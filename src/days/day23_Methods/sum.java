package days.day23_Methods;

public class sum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum = " + sum);
        a = 5;
        b = 8;
        sum = a + b;
        System.out.println("sum = " + sum);
        sumOfTheNumber(10,20,30);
        int i = returnSum(40, 60, 100);
        System.out.println("i = " + i);
    }

    public static void sumOfTheNumber(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);
    }
    public static int returnSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);
        return sum;
    }
}
