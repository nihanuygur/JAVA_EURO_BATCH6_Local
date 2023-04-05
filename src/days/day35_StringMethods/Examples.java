package days.day35_StringMethods;

public class Examples {
    public static void main(String[] args) {
        String person = "Denis";
        helloName(person);
        System.out.println(helloName("Bob"));
        extraEnd("Hello");
    }
    public static String helloName(String name){
        return "Hello ".concat(name).concat("!");
        /*

Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
         */

    }
    public static void extraEnd(String str){
        if (str.length()>2){
            String end = str.substring(str.length()-2);
            System.out.println(end.concat(end).concat(end));
        }
    }
}
