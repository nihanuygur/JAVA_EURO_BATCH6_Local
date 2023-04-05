package days.day40_WrapperClasses;

public class ConvertWrappers {
    public static void main(String[] args) {
        Integer intO = Integer.valueOf(123);
        intO =123; // Autoboxing
        System.out.println("intO = " + intO);

        int i = intO.intValue(); // Unboxing
        System.out.println("i = " + i);

        Double doubleO = Double.valueOf(1.5);
        int dtoint = doubleO.intValue(); // (int)doubleObj.doubleValue();
        System.out.println("dtoint = " + dtoint);

        double d = doubleO.doubleValue();
        System.out.println("d = " + d);

        int value= 2;
        Integer intObj =value; // --> Autoboxing !!!

        int value2= intObj; // -->Unboxing !!!


        Integer obj1 = Integer.valueOf("2");
        Integer obj2 = Integer.parseInt("2");


        String str = "2";
        obj2 = Integer.parseInt(str);
        System.out.println("obj2 = " + obj2);

        Integer number = 1234;
        String number2 = String.valueOf(number);

        Integer number3 = 1234;
        String number4 = number3.toString();
        System.out.println(number4);


    }
}
