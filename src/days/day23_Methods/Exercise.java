package days.day23_Methods;

public class Exercise {
    public static void main(String[] args) {
        // greater number
        greaterNumber(10, 20);
        biggerNumber(30,35); // with return, biggerNumber method has a value so we can assign this value to a new variable,
        int bigNumber= biggerNumber(10,-10);
        System.out.println(bigNumber);
    }

    public static void greaterNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal");
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
    public static int biggerNumber(int a, int b) { // we use return, so we must change void to data type.
        int greaterNumber2 = 0;
        if (a > b) {
            greaterNumber2 =a;
        }  else {
            greaterNumber2 =b;
        }
        System.out.println("greaterNumber2 = " + greaterNumber2);
        return greaterNumber2;
    }


}
