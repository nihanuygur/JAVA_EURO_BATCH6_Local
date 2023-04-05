package days.day7TalhaT;

public class ExplicitlyCasting {
    public static void main(String[] args) {


    int number = 10; // NO CASTING !!

    double rate = number; // Assign int to double --> this will be handled by JAVA Comp automatically
    // Implicitly Casting - Widening

        System.out.println("number = " + number);

        System.out.println("rate = " + rate);


    byte hours= 24;  //  no EXPLICITLY casting, because value is between byte values-128 ~ 127

    int intNumber = hours;  // Implicitly Casting - Widening

    intNumber = 24;


///        intNumber = 24.0; // EXPLICITLY !!

    //  hours = 130; // need to be EXPLICITLY casting why? because value is out of byte values!!

    short sValue= 10000; // short <- int but no need casting why? because 10000 is inside of short range!!

//        sValue = 40000; // value is outside of short range so need to EXPLICITLY CASTING!!!!
    }
}
