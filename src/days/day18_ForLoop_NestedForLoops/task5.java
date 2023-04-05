package days.day18_ForLoop_NestedForLoops;

public class task5 {
    public static void main(String[] args) {
        // write a program to find the factorial value of any number
        int number = 5;
        int factor = 1;
        for (int i = 2; i <= number; i++) {
            factor = i;
            System.out.print(i + "!: ");
            for (int z = 1; z < i; z++) {
                factor *= z;
            }
            System.out.println(factor);
        }


            for (int z = 1; z < number; z++) {
                factor *= z;
                System.out.println(factor);
            }





    }
}
