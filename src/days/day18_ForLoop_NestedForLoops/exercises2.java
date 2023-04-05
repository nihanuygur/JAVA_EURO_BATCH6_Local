package days.day18_ForLoop_NestedForLoops;

public class exercises2 {
    public static void main(String[] args) {
        //      *
        //     ***
        //    *****
        //   *******
        for (int z=1;z<8;z+=2){
            for (int i = 3; i >=0; i--) {

                for (int x = i; x >= 0; x--) {
                    System.out.print(".");
                        for (int y=1; y <= z;y++){
                            System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

     // prime numbers 2-50(nested loops)
     // fibonacci numbers
     // print alphabet
     // how to print factors of the numbers
     // write a program to find the factorial value of any number
     // print diamond-other patterns

//        for (int i = 5; i > 0; i--) {
//            for (int x = i; x > 0; x--) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }



    }
}
