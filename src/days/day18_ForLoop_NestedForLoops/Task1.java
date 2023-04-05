package days.day18_ForLoop_NestedForLoops;

public class Task1 {
    public static void main(String[] args) {
        //prime numbers 2-50 (nested loops)
        int number = 50;

        for (int z = 2; z <= number; z++) {
            boolean isPrime = true;
            for (int i = 2; i < z; i++) {
                if (z % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(z + " ");
            }
        }








    }
}


