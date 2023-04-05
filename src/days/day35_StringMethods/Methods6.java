package days.day35_StringMethods;

public class
Methods6 {
    public static void main(String[] args) {
        String city = "London";
        String city2 = "London2";
        city.length(); // how many characters in the string
        city.charAt(0); // will return character on that index
        city.toLowerCase(); // will make all the letters lowercase
        city.toUpperCase(); // will make all the letters uppercase
        city.trim(); // will remove spaces from the beginning and end
        city.contains(""); // will check whether it contains or not
        city.concat(""); // will make concatenation
        city.startsWith("");
        city.endsWith("");
        city.replace(' ',' '); // accept char
        city.replaceAll("",""); // will change some part of the string
        city.equals("");
        city.equalsIgnoreCase("");
        city.indexOf("");
        city.lastIndexOf("");
        city.isEmpty(); // Returns true if, and only if, length() is 0.
        city.substring(0,2); // will return as string in border
        System.out.println("city.compareTo(city2) = " + city.compareTo(city2));
        System.out.println("city.charAt(6) = " + city.charAt(5));
        System.out.println("Character.isLetterOrDigit('+') = " + Character.isLetterOrDigit('+'));
        System.out.println("city.substring(3,3) = " + city.substring(3,3));
        System.out.println("city.lastIndexOf(\"o\",2) = " + city.lastIndexOf("o", 6));
        String s="Welcome to Java";
        System.out.println("s.lastIndexOf(\"Java\",5) = " + s.lastIndexOf("Java", 5));

        city="abc";
        city2="abq";
        System.out.println("city.compareTo(city2) = " + city.compareTo(city2));

    }
}
