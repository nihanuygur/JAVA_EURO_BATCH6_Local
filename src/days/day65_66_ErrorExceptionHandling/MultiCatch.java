package days.day65_66_ErrorExceptionHandling;

public class MultiCatch {
    public static void main(String[] args) {
        System.out.println("Before TRY");

        try{
            System.out.println("IN TRY BLOCK");
            abcTest();
            abcTest().contains("test");
            // let's assume that this method can throw these exceptions:
            // 1- nullPointer -> if DB/api connection issue , re-connect DB !! and continue test !!
            // 2- arithmetic -> if total value is 0 means test should be fai;, db insertion not working, bug scenario...
            // 3- arrayIndexOfB -> if db data manipulated ... I need to skip test !!

            System.out.println("End TRY BLOCK");

            // multi catch -> we need to choose less than greater the parameters
        }catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace(); // it will print exception
            System.out.println("!! ARRAY size changed, skip this step!!");
        }catch (ArithmeticException a){
//            a.printStackTrace();
            System.out.println("!!  INPUT VALUE IS 0, TEST FAIL");
        }catch (NullPointerException n){
//            n.printStackTrace();
            System.err.println("!! DB connection RESET ! Ready to go !! ");
//            System.out.println("n.getMessage() = " + n.getMessage());
            System.out.println("n.toString() = " + n.toString()); // source of the error message
        }
        System.out.println("AFTER TRY");
    }
    public static String abcTest(){
        //do some automation...
        //do some automation...
        //do some automation...
        int total_value=0;
        int finalPrice=100/total_value;
        return null;

    }
}
