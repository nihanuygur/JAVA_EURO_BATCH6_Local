package days.day67_Maps;

import java.util.*;

public class Maps3_With_List {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Turkey", "Ankara");

        Map<String, List<String>> cities = new HashMap<>();

        List<String> germanCities = new ArrayList<>();
        germanCities.add("Berlin");
        germanCities.add("Munich");
        germanCities.add("Frankfurt");
        cities.put("Germany", germanCities); // 1. WAY

        cities.put("England", Arrays.asList("London", "Leicester", "Leeds", "Newcastle")); // 2. WAY
        cities.put("Turkey", Arrays.asList("Maras", "Antep", "Hayat", "Adiyaman"));

        System.out.println("cities.get(\"Germany\") = " + cities.get("Germany")); // [Berlin, Munich, Frankfurt]
        System.out.println("cities.get(\"Germany\").get(2) = " + cities.get("Germany").get(2)); // Frankfurt
        System.out.println("cities.get(\"England\").size() = " + cities.get("England").size()); // England's cities size
        System.out.println("cities.size() = " + cities.size()); // size of HashMap
        for (List<String> value : cities.values()) {
            System.out.println("cities = " + value);
            System.out.println("first city = " + value.get(0));
        }
        cities.entrySet().stream().forEach(System.out::println);
    }
}
