package days.day35_StringMethods;

public class codebat {
    public static void main(String[] args) {
        /*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
         */
        firstHal("WooHoo");
    }
    public static void firstHal(String str){

        if (str.length()%2==0){

            String half = str.substring(0,str.length()/2);
            System.out.println(half);
        }
    }

}
