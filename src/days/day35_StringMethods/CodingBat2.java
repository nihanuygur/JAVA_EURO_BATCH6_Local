package days.day35_StringMethods;

public class CodingBat2 {
    public static void main(String[] args) {
        /*

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
         */
        withoutEnd("Hello");
    }
    public  static void withoutEnd(String str){

        String word = str.substring(1,str.length()-1);
        System.out.println(word);

    }
}
