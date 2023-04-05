package days.day34_StringClass;

public class StringMethods {
    public static void main(String[] args) {

        String password = "Test123_";
        String pin = "234567";

        // should contain at least 1 numeric character
        // should contain at least 1 symbol
        // should contain at least 1 _
        // should contain at least 1 Upper Case
        // PIN must contain only numeric values !!

        // need to create verification
        // we need to check each character of string !!!

        // need a loop to check each of them
        // need to know how many char I have for loop iteration !! --> SOLUTION : length() !!!
        // in each iteration of the loop I need call each char


        /// .length()
        int length = password.length(); // --> returns number of chars inside string

        System.out.println("length = " + length);

        String test = "";
        System.out.println(test);
        System.out.println("test.length() = " + test.length());

        test = "    ";
        System.out.println(test);
        System.out.println("test.length() = " + test.length());
        int spaceDecimal = ' ';
        System.out.println(spaceDecimal);

        /// .charAt()

        String str = "String";
        // INDEX   =  012345
        // LENGTH  =  123456

        // ALL INDEX starts with 0 --> INDEX : 01234...

        char zeroIndex = str.charAt(0); // first character of str
        zeroIndex = str.charAt(str.length() - 1); // last character of str
        System.out.println("zeroIndex = " + zeroIndex);
//        System.out.println("str.charAt(5) = " + str.charAt(5));   ---> it will give error
        String input = "Total result is 216";
        int expectedValue = 21;

        /// .concat()

        String name = "Nazli", surname = "Polat";
        String fullName = name.concat(surname);
        System.out.println("fullName = " + fullName);

        /// .contains()

        test = "Java is my programing language."; // it contains 'Java' ??

        // LONG WAY
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == 'J' && test.charAt(i + 1) == 'a' && test.charAt(i + 2) == 'v' && test.charAt(i + 3) == 'a') {
                System.out.println("Yes contains!!");
            }
        }

        // SHORT WAY
        System.out.println("test.contains('Java') = " + test.contains("Java")); // true
        System.out.println("test.contains('java') = " + test.contains("java")); // false
        System.out.println("test.contains('Java ') = " + test.contains("Java ")); // true
        System.out.println("test.contains('ava') = " + test.contains("ava")); // true
        System.out.println("test.contains('language. ') = " + test.contains("language. ")); // false
        System.out.println("test.contains('a ') = " + test.contains("a ")); // true

        input
                = "1-16 of 216 results for";
        String expectedData = "216";
        // if I need verify a value in string, basically call contains methods!!
        System.out.println("Verify that actual result is equal expected one: ");
        if (input.contains(expectedData)) {
            System.out.println("PASSED!!");


        } else {
            System.out.println("FAILED!!");
        }

        /// .indexOf()
        // give me char/String take index !!
        input = "Seyit is a Test Engineer";

        System.out.println("input.indexOf('S') = " + input.indexOf("S")); // --> 0
        System.out.println("input.indexOf('s') = " + input.indexOf("s")); // --> 7 it will return
        // the first one's index from left
        System.out.println("input.indexOf('s') = " + input.lastIndexOf("s")); // --> 13 from right
        System.out.println("input.indexOf('x') = " + input.indexOf("x")); // --> -1 if it is not EXIST !!!
        System.out.println("input.indexOf('Seyit') = " + input.indexOf("Seyit")); // 0 --> it will check
        // the first char and return its value
        System.out.println("input.indexOf('test') = " + input.indexOf("Test")); // 11
        System.out.println("input.indexOf('test') = " + input.indexOf("test")); // -1
        System.out.println(input.toUpperCase());
        System.out.println(input);


    }
}
