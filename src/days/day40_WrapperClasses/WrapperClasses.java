package days.day40_WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer object = new Integer(1);
        Integer object2 = new Integer("1");
        System.out.println("object = " + object);
        System.out.println("object2 = " + object2);

        int intPrimitive = 1;
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.max(123,345) = " + Integer.max(123, 345));
        System.out.println("Integer.sum(123,345) = " + Integer.sum(123, 345));
        System.out.println("Integer.reverse(12345) = " + Integer.reverse(12345));

//        Integer intObj = new Integer(1); // intObj = 1; same meaning it is not necessary calling constructor -> new Integer()
        Integer intObj = 1;
        System.out.println("intObj = " + intObj);

                intObj = new Integer("1");
        System.out.println("intObj = " + intObj);

        intObj = Integer.valueOf(1);
        System.out.println("intObj = " + intObj);

        intObj = Integer.valueOf("1");
        System.out.println("intObj = " + intObj);

//        intObj = Integer.valueOf("1.0"); throws NumberFormatException Error
//        System.out.println("intObj = " + intObj);

//        intObj = Integer.valueOf("123145678908765432"); throws NumberFormatException Error
//        System.out.println("intObj = " + intObj);

//        intObj = Integer.valueOf("a");  throws NumberFormatException Error
//        System.out.println("intObj = " + intObj);

        Boolean booleanObj = false;
        System.out.println("booleanObj = " + booleanObj);

        booleanObj = Boolean.valueOf("FALSE"); // false is the key word, normally we can't do this,
        // but it is the feature of valueOf methods
        System.out.println("booleanObj = " + booleanObj);

        booleanObj = Boolean.valueOf("False"); // false is the key word, normally we can't do this,
        // but it is the feature of valueOf methods
        System.out.println("booleanObj = " + booleanObj);

        booleanObj = Boolean.valueOf("false");
        System.out.println("booleanObj = " + booleanObj);

        Character charObj= Character.valueOf('A');
        System.out.println("charObj = " + charObj);

//        Character charObj= Character.valueOf(65); ERROR!!!

        charObj= 'A';
        System.out.println("charObj = " + charObj);

        System.out.println("\n//////////////////////////////\n");

        byte bytePrimitive = 127;

//        Byte byteObj = Byte.valueOf(127); throws compile time error!! because 127 is int as parameter
        Byte byteObj = Byte.valueOf((byte)127);
        byteObj = (byte)127;
        System.out.println("byteObj = " + byteObj);
        byteObj = 127;
        System.out.println("byteObj = " + byteObj);


        System.out.println("\n//////////////////////////////\n");

        Short shortObj = Short.valueOf((short) 111);
        shortObj = 111;
        System.out.println("shortObj = " + shortObj);


        Double doubleObj = Double.valueOf(1);
        System.out.println("doubleObj = " + doubleObj);




    }
}
