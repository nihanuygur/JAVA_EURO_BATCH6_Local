package days.day43_REVIEW_Week;

import java.util.ArrayList;
import java.util.Arrays;

public class NBA {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Green");
        // any element of the arrayList is black
        if (colors.get(0).equals("dark")) {
            System.out.println("first element is dark");
        } else if (colors.get(1).equals("dark")) {
            System.out.println("second element is dark");
        } else {
            System.out.println("No dark element");


            ArrayList<String> scores = new ArrayList<>(); // Each member of the ArrayList is an element
            scores.add("Miami Heats NY Knocks : 135 - 120");
            scores.add("Toronto New Jersey : 105 - 110");
            scores.add("Oklahoma Detroit : 140 - 120");
            scores.add("Washington Cleveland : 150 - 145");
            String[] split1;

            String[] result = scores.get(0).split(":");
            System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
            String[] numberSplit = result[1].split("-");
            Integer first = Integer.parseInt(numberSplit[1].trim());
            Integer second = Integer.parseInt(numberSplit[0].trim());
            System.out.println("first = " + first);
            System.out.println("second = " + second);


           String[] numbers = scores.get(0).split(":")[1].split("-");


        }
    }
}
