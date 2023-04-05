package days.day7_CastOperatorsTypeCasting;

public class ImplicitlyCasting {
    public static void main(String[] args) {

        int number = 10; // NO CASTING

        double rate = number; // assign int to double --> this will be handle by JAVA Compiler
                              // Implicitly Casting - Widening

        System.out.println("number = " + number);
        System.out.println("rate = " + rate);

        byte hours = 24; // no EXPLICITLY casting, because value is between byte values -128 127
        int intNumber = hours; // Implicitly Casting - widening

        intNumber = 24;
        // intNumber = 24.0; // EXPLICITY !!



        byte numByte = 127;

        double numDouble = 10.1;

        int numInt = 1;

        numDouble = numInt; // Implicitly Casting - Widening

        System.out.println("numDouble = " + numDouble);

        numByte = 1;
        // numByte = numInt // we are not looking value in first place, just compare data type !!

        // Practice
        int num2 = 123;

        byte bnum2 = 121;

        //byte num2 =



    }
}
