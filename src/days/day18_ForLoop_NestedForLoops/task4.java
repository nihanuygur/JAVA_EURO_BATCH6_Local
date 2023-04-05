package days.day18_ForLoop_NestedForLoops;

public class task4 {
    public static void main(String[] args) {
        // how to print factors of the numbers
        int number = 10;
        for (int i = 2; i <= number; i++) {
            System.out.print("factors of number "+i+" = ");
            for (int z = 1; z<=number; z++) {
                if (i%z==0){
                    System.out.print(z + " ");

                }
            }
            System.out.println();
        }




    }
}
