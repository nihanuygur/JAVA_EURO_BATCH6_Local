package days.day58_Abstraction;

import java.util.ArrayList;

public class Builder {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello"); // immutable

        StringBuilder builder =  new StringBuilder("Hello"); // mutable
        System.out.println("builder = " + builder);
        builder.append(" Java");  // append -> concentration
        System.out.println("builder = " + builder); // Hello Java
        builder.delete(5,7);                        // 0123456789
        System.out.println("builder = " + builder); // Helloava
        builder.reverse();
        System.out.println("builder = " + builder); // avaolleH
        StringBuilder builder1 = new StringBuilder("String");

        builder1 = new StringBuilder(str); // String -> StringBuilder
        builder1.insert(2, "00000");
        System.out.println("builder1 = " + builder1); // He00000llo
        builder1.reverse();
        System.out.println("builder1 = " + builder1); // oll00000eH

        StringBuilder build = new StringBuilder("Java");
        build.reverse();
        String reversed = String.valueOf(build); // StringBuilder -> String
        StringBuilder builder2 = new StringBuilder(reversed);
        System.out.println("builder2 = " + builder2);
        ArrayList<StringBuilder> listOfBuilder = new ArrayList<>();
        listOfBuilder.add(builder2);

        String reserved  =  SomeMethods.reverseString("Hello"); // we call this method from SomeMethods class
        System.out.println("reserved = " + reserved);






    }
}
