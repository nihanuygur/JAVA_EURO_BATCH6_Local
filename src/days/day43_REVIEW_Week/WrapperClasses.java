package days.day43_REVIEW_Week;

import days.day25FarukT.Student;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
//  byte short int long float double boolean char
        Byte b;
        Short s;
        Integer i;
        Long l ;
        Float f;
        Double d;
        Boolean bln;
        Character c;
        ArrayList <Integer> numbers = new ArrayList<>();
        Student student = new Student();
        Integer num = 10; //isn't recommended to use -> Integer num = new Integer(10);
        String str = new String("Oslo");
         str = "Oslo";
        Integer number1=Integer.valueOf(50);
        String str2= "200";

        num=Integer.valueOf(str2); // first way - converting string -> integer
        num = Integer.parseInt(str2);  // second way - converting string -> integer

        str2= "  200  "; // it will give error normally, but we can use trim methods to remove spaces
        int i2= Integer.parseInt(str2.trim()); // 200
        double d6 = 50.50;
        Double d55 = d6; //  Auto boxing  primitive -->  object
        double d7 = d55; // Auto Unboxing  object -->  primitive







    }
}
