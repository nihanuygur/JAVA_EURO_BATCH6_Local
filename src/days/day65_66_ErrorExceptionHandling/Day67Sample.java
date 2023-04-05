package days.day65_66_ErrorExceptionHandling;

public class Day67Sample {

    public static void main(String[] args) {

        System.out.println("MAIN METHOD");
        try {
//            int a=1;
//            int b=0;
//            System.out.println("Test value "+ (a/b));
        } finally {
            System.out.println("FINALLY BLOCK !!");
        }
//        try{
//            int a=1;
//            int b=0;
//            System.out.println("Test value "+ (a/b));
//
//        }catch (Exception e){
//            System.out.println("WE CAUGHT EXCEPTION!");
//        }
//
//        System.out.println("END OF MAIN ! ");
        ///////////////////////////

        try{
            System.out.println("TRY BLOCK - first line ");
            throw new NullPointerException(); //            NullPointerException e =new NullPointerException();
//            System.out.println("TRY BLOCK - last line "); // red line -> Unreachable statement
        }catch (Exception e){
            System.out.println("WE CAUGHT EXCEPTION!");
        }

        System.out.println("END OF MAIN ! ");
    }
}
