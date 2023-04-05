package days.day59_Interface_Enums;

public interface B {
    // we can't create a new object from interface
    // all attributes are public , static , final
    // set up structures

    int b = 20;  // we don't need to write public static final , it is already public static final
    int num = 0; // final attributes must be assigned
    String city = "Oslo"; // to store and reach this values from everywhere without any changing

    // we can't create constructor with interface

    void printB();  // all methods are without method body and without key word before void - and no abstract key word


    // after Java9 we can use
// Static methods
// Private methods
// Private Static methods
    static void writeB() {
        // static methods have body
        System.out.println("Writing something");
    }

    default void writeC(){ // not suggested way
        System.out.println("Default");
    }
}
