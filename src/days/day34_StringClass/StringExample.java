package days.day34_StringClass;

public class StringExample {

    public static void main(String[] args) {
        String name = "123erfdsdfghtr"; //By String Literal --- created with " "

        String str = new String("Hello"); // By 'new' Keyword

        //////

        String newStr = new String();
        newStr = "newStr";

        String newStr2 = new String("newStr2");

        System.out.println("newStr2 = " + newStr2);

//        StringExample obj = new String();
//        System.out.println("obj = " + obj);

        /////
        // Checking == with literal and new
        String str1 = "Ozdemir";
        String str2 = "Ozdemir";

        String str3 = new String("Keti");
        String str4 = new String("Keti");

        System.out.println("str1==str2 = " + (str1 == str2));
        System.out.println("str3==str4 = " + (str3 == str4));

    }
}
