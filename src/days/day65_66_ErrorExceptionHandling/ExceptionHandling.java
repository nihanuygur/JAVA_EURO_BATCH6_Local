package days.day65_66_ErrorExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Top of MAIN");

        try { //only monitor and report to catch!!
            System.out.println("Test 1");
            System.out.println("Test 2");
//            int a=1/0;
//            String expectedValue = null; // null will come to the dB query call // NullPointerException
            String expectedValue = "10001ABC 10001ABC"; // null will come to the dB query call
            if (expectedValue.contains("10001ABC")) { // invoice id
                System.out.println("TEST PASSED !!");
            } else {
                System.out.println("TEST FAILED !!");
            }

            System.out.println("Test 3"+ 1/0); // ArithmeticException
            System.out.println("Test 4");
        } catch (NullPointerException n) {// catch will catch and stop them - if exception obj same level or lower
            System.out.println("Inside catch block");
            System.out.println("TEST STOPPED! CHECK DB CONNECTION!!!");
        }
//        catch (Exception e) {// catch will catch and stop them - if exception obj same level or lower
        // exception is big brother
//            System.out.println("Inside catch block");
//            System.out.println("TEST STOPPED! CHECK DB CONNECTION!!!");
//        }
        System.out.println("End of MAIN");
    }
}
