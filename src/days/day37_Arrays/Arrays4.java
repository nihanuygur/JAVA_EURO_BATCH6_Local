package days.day37_Arrays;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 80, 90, 60};
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers[4] = " + numbers[4]);


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[] = " + numbers[i]);
        }
        String[] cities = new String[4];
        System.out.println("cities.length = " + cities.length); // 4
        cities[3] = "Istanbul";
        cities[0] = "Munich";
        cities[1] = "Madrid";
        cities[2] = "London";
        System.out.println("cities[4] = " + cities[4]);
        System.out.println("Arrays.toString(cities) = " + Arrays.toString(cities));

        for (int i = 0; i < cities.length; i++) {
            System.out.println("cities[] = " + cities[i]);
        }
        // number = { 10 , 5 , 80 , 90 , 60}; length is 5
        for (int each: numbers){
            System.out.println("number = " + each);
        }
        //  cities = [Munich, Madrid, London, Istanbul]
        for (String each : cities){
            System.out.println("city = " + each);
        }
        for ( String each : cities)
              {

        }

    }
}
