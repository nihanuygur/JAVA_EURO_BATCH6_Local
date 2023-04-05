package days.day17_ForLoop_NestedForLoops;

public class printNumber {
    public static void main(String[] args) {
        //0-20
        for (int i=0; i<=20;i++){
            System.out.print(" "+i);
        }

        //even/odd numbers between 0 - 20
        for (int x=0; x<20 ; x++ ) {
            if (x % 2 == 0) {
                System.out.println(x + " is an even number.");
            }else {

                System.out.println(x + " is an odd number.");
            }
        }

        int first =0;
        int end =20;

        for (int x=first; x<end ; x++ ) {
            if (x % 2 == 0) {
                System.out.println(x + " is an even number.");
            }else {

                System.out.println(x + " is an odd number.");
            }
        }










    }
}
