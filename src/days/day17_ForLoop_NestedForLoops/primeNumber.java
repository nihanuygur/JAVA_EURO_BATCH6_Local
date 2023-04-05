package days.day17_ForLoop_NestedForLoops;

public class primeNumber {
    public static void main(String[] args) {
        //prime numbers 1-50
        int number =20;
        int x =0;
        for (int i = 2;i<number;i++) {
            if (number%i==0){
                x++;
            }

        }
        if (x==0){
            System.out.println(number + " is a prime number.");
        }else {
            System.out.println(number + " is not a prime number.");
        }






    }
}
