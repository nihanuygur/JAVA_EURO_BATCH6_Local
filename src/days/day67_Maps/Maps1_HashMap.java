package days.day67_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps1_HashMap {
    public static void main(String[] args) {

        //    key       value
        //    String    Integer
        //    ronaldo   7
        //    messi     10

        //         key     value
        HashMap<String, Integer> playerNumbers = new HashMap<>();

        // put()
        playerNumbers.put("Ronaldo", 7);
        playerNumbers.put("Messi", 10);
        playerNumbers.put("Rivaldo", 15);
        playerNumbers.put("Hakan", 111);
        playerNumbers.put("Hakan", 9); // HashMap doesn't accept duplicated keys, it will update same key


        // get()
        System.out.println("playerNumbers.get(Rivaldo) = " + playerNumbers.get("Rivaldo"));
        System.out.println("playerNumbers.get(\"hakan\") = " + playerNumbers.get("hakan")); // null // java is case-sensitive !!
        System.out.println("playerNumbers.get(\"Hakan\") = " + playerNumbers.get("Hakan"));

        // printing
        System.out.println("playerNumbers = " + playerNumbers);

        // keySet()
        System.out.println("playerNumbers.keySet() = " + playerNumbers.keySet());
        Set <String> players = playerNumbers.keySet();
        for (String name : playerNumbers.keySet()) {
            System.out.println("name = " + name);
        }

        // values()
        System.out.println("playerNumbers.values() = " + playerNumbers.values());
        for (Integer value : playerNumbers.values()) {
            System.out.println("value = " + value);
        }

        System.out.println("playerNumbers.entrySet() = " + playerNumbers.entrySet());
        for (Map.Entry<String, Integer> stringIntegerEntry : playerNumbers.entrySet()) {
            System.out.println("stringIntegerEntry = " + stringIntegerEntry);
        }

        // remove()
        playerNumbers.remove("Rivaldo");
        System.out.println("playerNumbers = " + playerNumbers);

        // containsKey()
        System.out.println("playerNumbers.containsKey(\"Hakan\") = " + playerNumbers.containsKey("Hakan"));

        //containsValue()
        System.out.println("playerNumbers.containsValue(10) = " + playerNumbers.containsValue(10));

        // putIfAbsent()
        playerNumbers.putIfAbsent("Ronaldo",5);
        System.out.println("playerNumbers = " + playerNumbers);

printMaps(playerNumbers);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Veli",2);
        map2.putAll(playerNumbers);
        System.out.println("map2 = " + map2);// {Ronaldo=7, Veli=2, Hakan=9, Messi=10}
                                             // there is no insertion order in HashMap!!

        // size()
        System.out.println("playerNumbers.size() = " + playerNumbers.size());

        // clear()
        playerNumbers.clear();
        System.out.println("playerNumbers = " + playerNumbers);

        // size()
        System.out.println("playerNumbers.size() = " + playerNumbers.size());

    }
//    public static void printMaps(Map maps){ // no problem, it works
    public static void printMaps(Map<String, Integer> maps){

    }
}
