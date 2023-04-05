package days.day34TalhaT;

public class MethodsEquals {
    public static void main(String[] args) {
        String city = "Oslo";
        String city2= new String("Oslo");
        System.out.println("city.equals(city2) = " + city.equals(city2)); // true
        System.out.println("city==city2 = " + city == city2); // false
        String city3 = "Oslo";
        System.out.println("city==city3 = " + city == city3); // true
        System.out.println("city.equals(city3) = " + city.equals(city3)); // true

    }
}
