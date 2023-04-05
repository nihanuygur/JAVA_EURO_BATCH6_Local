package days.day58_Abstraction;

public class SomeMethods {
    public static void main(String[] args) {
        // create a method, get a string value as an argument, reverse it and return reversed value
        System.out.println(reverseString("School"));
        String word="Hospital";
        System.out.println(reverseString(word));
    }

    public static String reverseString(String str){
        StringBuilder builderS = new StringBuilder(str);
        builderS.reverse();
        str=String.valueOf(builderS); // str= new String(builder)
        return str;
    }

    public String reverseString2(String str){
        StringBuilder builderS = new StringBuilder(str);
        builderS.reverse();
        str=String.valueOf(builderS); // str= new String(builder)
        return str;
    }
}
