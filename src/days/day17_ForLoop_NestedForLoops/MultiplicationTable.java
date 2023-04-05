package days.day17_ForLoop_NestedForLoops;

public class MultiplicationTable {
    public static void main(String[] args) {


        // multiplication for number 7
        int number = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        //sum of the numbers 0-50
        int result =0;
        for (int i =0; i<=50;i++){
            result +=i;
        }
        System.out.println(result);
    }
}
