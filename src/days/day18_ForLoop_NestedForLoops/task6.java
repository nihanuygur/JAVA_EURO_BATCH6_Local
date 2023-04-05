package days.day18_ForLoop_NestedForLoops;

public class task6 {
    public static void main(String[] args) {
        // print diamond-other patterns
        //      *
        //     ***
        //    *****
        //   *******
        for (int i = 0; i <= 3; i++) {
            for (int x = 0; x <= 6; x++) {
                if (x >= (3 - i) && x <= 3 + i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int x = 1; x <= 3; x++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.println("");
        }


    }
}
