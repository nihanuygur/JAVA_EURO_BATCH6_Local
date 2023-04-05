package days.day40_WrapperClasses;

public class WrapperSample {
    public static void main(String[] args) {
        String password = "123ABC+";

        // there should be at least 1 number
        // there should be at least 1 letter
        // there should be at least 1 character/symbol


        String[] split= password.split("");

        System.out.println("Character.isAlphabetic('a') = " + Character.isAlphabetic('a'));
        System.out.println("Character.isDigit('1') = " + Character.isDigit('1'));
        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));
        // if it is not digit or alphabetic (false + false), we can understand it is a  character/symbol


        for (int i = 0; i < split.length; i++) {
            String s = split[i];

        }

        Integer intObj = 4;
        System.out.println("intObj instanceof Integer = " + (intObj instanceof Integer));



    }
    public void test(String test){
        Integer tt = Integer.valueOf(test);
        System.out.println(" = "+(tt instanceof Integer));
    }
}
