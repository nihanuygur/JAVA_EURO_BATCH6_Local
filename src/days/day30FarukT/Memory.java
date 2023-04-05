package days.day30FarukT;

public class Memory {
    public static void main(String[] args) {
        String city = "Oslo";
        String town = "Oslo";
        System.out.println(city == town);
        String secondCity = new String("Oslo");
        System.out.println("secondCity = " + secondCity);
        System.out.println("city = " + city);
        System.out.println(secondCity == city);

    }
}
