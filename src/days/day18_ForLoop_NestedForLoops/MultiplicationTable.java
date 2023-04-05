package days.day18_ForLoop_NestedForLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
        //1-10
        for (int i = 1; i <= 10; i++) {
            for (int x = 0; x <= 10; x++) {
                System.out.println(i + " X " + x + " = " + i * x);
            }
            System.out.println();
        }

        // ****
        // ****
        // ****
        // ****

        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {

                System.out.print("*");
            }
            System.out.println();
        }

        //   *
        //   **
        //   ***
        //   ****
        for (int i = 1; i < 6; i++) {
            for (int x = 0; x < i; x++) {

                System.out.print("*");
            }
            System.out.println();
        }
        //   *****
        //   ****
        //   ***
        //   **
        //   *



        for (int i = 5; i > 0; i--) {
            for (int x = i; x > 0; x--) {

                System.out.print("*");
            }
            System.out.println();
        }






    }
}
