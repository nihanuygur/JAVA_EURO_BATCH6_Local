package days.day18_ForLoop_NestedForLoops;

public class task2 {
    public static void main(String[] args) {
        // fibonacci numbers
        int n = 100;
        int t1 = 0;
        int t2 = 1;
        for (int i = 1; i < 20; i++) {
            System.out.print(t1 + " ");
                int t3 = t1 + t2;
                t1 = t2;
                t2 = t3;
        }
        System.out.println();


        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        for (int i = 1; i < 20; i++) {
            System.out.print(firstNumber+" ");

            sum = firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=sum;
        }

    }
}
