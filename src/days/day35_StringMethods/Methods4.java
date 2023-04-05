package days.day35_StringMethods;

public class Methods4 {
    public static void main(String[] args) {
        String str = "Life is beautiful";
        //            01234567890123456
        str.substring(8); // beautiful
        String life = "Life";
        life = str.substring(0,4); // 0 inclusive  -  4 exclusive
        System.out.println("str.substring(0,10) = " + str.substring(0, 10));
        System.out.println("str.substring(str.length()-2) = " + str.substring(str.length() - 2)); // last 2 character


    }
}
