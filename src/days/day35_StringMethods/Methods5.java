package days.day35_StringMethods;

public class Methods5 {
    public static void main(String[] args) {
        String str = "LIFE IS BEAUTIFUL";
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        System.out.println("str = " + str); // toLoweCase method will not affect,  same value.
        String s = str.toLowerCase();
        System.out.println("s = " + s);
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.startsWith(\"Life\") = " + s.startsWith("Life"));
        System.out.println("str.substring(0,4).toLowerCase()+str.substring(4) = "
                + str.substring(0, 4).toLowerCase() + str.substring(4)); // separately lowe/upper
        System.out.println("Hello"+ "   life   "+"Hello");
        System.out.println("Hello"+ "   life   ".trim()+"Hello"); // trim erases the white spaces


    }
}
