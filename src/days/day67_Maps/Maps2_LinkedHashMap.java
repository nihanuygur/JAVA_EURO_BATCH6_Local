package days.day67_Maps;

import java.util.*;

public class Maps2_LinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String ,String> capitals=new LinkedHashMap<>();
        capitals.put("England","London");
        capitals.put("Germany","Berlin");
        capitals.put("Turkey","Ankara");
        capitals.put("Spain","Madrid");
        capitals.put("Norway","Oslo");
        System.out.println("capitals = " + capitals);
        System.out.println("capitals.get(\"Norway\") = " + capitals.get("Norway"));
        String norwayCapital = capitals.get("Norway");
        System.out.println("norwayCapital = " + norwayCapital);
        System.out.println("capitals.keySet() = " + capitals.keySet());
        System.out.println("capitals.values() = " + capitals.values());
        System.out.println("capitals.entrySet() = " + capitals.entrySet());
        for (Map.Entry<String,String> cities: capitals.entrySet()){
            System.out.println("cities = " + cities);
            System.out.println("cities.getKey() = " + cities.getKey());
            System.out.println("cities.getValue() = " + cities.getValue());
        }

        Map <String,String>capitals2=new HashMap<>(); // Polymorphism
        capitals2.put("Italy","Roma");

        Map <String,String>capitals3=new TreeMap<>(); // Polymorphism
        capitals3.put("Sweden", "Stockholm");

        Map <String,String>capitals4=new LinkedHashMap<>(); // Polymorphism
        capitals4.put("Scotland", "Glasgow");

        List<Map <String,String>>listOfCities=new ArrayList<>();
        listOfCities.add(capitals);
        listOfCities.add(capitals2);
        listOfCities.add(capitals3);
        listOfCities.add(capitals4);

        System.out.println("listOfCities.size() = " + listOfCities.size());
// [{England=London, Germany=Berlin, Turkey=Ankara, Spain=Madrid, Norway=Oslo}, {Italy=Roma}, {Sweden=Stockholm}, {Scotland=Glasgow}]
        System.out.println("listOfCities.get(2) = " + listOfCities.get(2));
        System.out.println("listOfCities.get(0) = " + listOfCities.get(0)); // to reach index 0
        System.out.println("listOfCities.get(0) = " + listOfCities.get(0).get("Turkey")); // to reach index 0 and value Ankara
        System.out.println("listOfCities = " + listOfCities);

        //        Map <String,String>capitals2=new HashMap<>(); // Polymorphism
        capitals2.put("England","London");
        capitals2.put("Germany","Berlin");
        capitals2.put("Turkey","Ankara");
        capitals2.put("Spain","Madrid");
        capitals2.put("Norway","Oslo");
        System.out.println("capitals2 = " + capitals2); // HashMap doesn't have insertion order
        System.out.println("capitals = " + capitals); // LinkedHashmap has insertion order

        Map<Integer,String>numberOfPerson = new TreeMap<>(); // ascending order a to z // not insertion
        numberOfPerson.put(5,"Veli");
        numberOfPerson.put(2,"Furkan");
        numberOfPerson.put(3,"Keti");
        numberOfPerson.put(1,"Messi");
        System.out.println("numberOfPerson = " + numberOfPerson); // {1=Messi, 2=Furkan, 3=Keti, 5=Veli} // ascending order a to z

        for (int i : numberOfPerson.keySet()){
            System.out.println("key = " + i);
            System.out.println(numberOfPerson.get(i));// value
        }

    }
}
