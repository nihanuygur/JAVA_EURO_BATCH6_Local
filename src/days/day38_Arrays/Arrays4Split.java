package days.day38_Arrays;

import java.util.Arrays;

public class Arrays4Split {
    public static void main(String[] args) {
        String str = "Happy new year see you next year";
        //           Happy
        //           new
        //           year
        //           see
        //           you
        //           next
        //           year

        String[] splitStr = str.split(" "); // String  --> String [] // will separate all element until ' '
        System.out.println("Arrays.toString(splitStr) = " + Arrays.toString(splitStr));
        System.out.println("str.length() = " + str.length());


        String text = " Ali said : Hello";
        String[] textSplit = text.split(":"); // will separate all element until ':'
        System.out.println("Arrays.toString(textSplit) = " + Arrays.toString(textSplit));

        String sentence = " Ali, Veli played basketball and they ate something";

        String[] splitSentence1 = sentence.split(",");
        String[] splitSentence2 = sentence.split(""); // letter by letter 
        String[] splitSentence3 = sentence.split("e"); // letter by letter 

        System.out.println("Arrays.toString(splitSentence1) = " + Arrays.toString(splitSentence1));
        // [ Ali,  Veli played basketball and they ate something]

        System.out.println("Arrays.toString(splitSentence2) = " + Arrays.toString(splitSentence2));
        //[ , A, l, i, ,,  , V, e, l, i,  , p, l, a, y, e, d,  , b, a, s, k, e, t, b, a, l, l,  
        // , a, n, d,  , t, h, e, y,  , a, t, e,  , s, o, m, e, t, h, i, n, g]

        System.out.println("Arrays.toString(splitSentence3) = " + Arrays.toString(splitSentence3));
        // [ Ali, V, li play, d bask, tball and th, y at,  som, thing]

        String result = "125-111-189-165";
        String[] splitResult = result.split("-");
        System.out.println("Arrays.toString(splitResult) = " + Arrays.toString(splitResult));
        System.out.println("splitResult[1] = " + splitResult[1]); // result.split("-")[1];

        String club = "Hertha Berlin";
        String[] splitClub = club.split(" ");
        System.out.println("splitClub[1] = " + splitClub[1]);

        String[] clubs = {"Real Madrid", "Hertha Berlin", "Sporting Lisbon", "Sparta Praque"};

        for (String s : clubs) {
            String[] n_clubs = s.split(" ");
            System.out.println("n_clubs[1]"+n_clubs[1]);
        }

        String[] cities = new String[clubs.length];
        int count= 0;
        for (String s : clubs) {
            cities[count] = s.split(" ")[1];
            count ++;
        }
        System.out.println("Arrays.toString(cities) = " + Arrays.toString(cities));


    }
}
