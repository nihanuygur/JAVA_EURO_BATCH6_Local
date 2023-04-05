package days.day68_GeneralReview8_10;

import java.util.*;

public class FindMaxPatient_Task {

    public static void main(String[] args) {

        // A,A,A,B,B,C,C,C

//       HOME TASK FOR GROUP
//        1- Type all possible test scenarios input values and type reasons
//        2- According to your scenarios, update/fix/improve given solution method
//        3- Try to update to improve performance

        // positive scenario
        String[] a = {"Cardiology", "Orthopaedics", "Neurology", "Cardiology", "Orthopaedics", "Cardiology"};
        System.out.println("findMaxPatient(a) = " + findMaxPatient(a));

        // uppercase / lowercase ignoring?
        String[] b = {"cardiology", "Orthopaedics", "neurology", "CARDIOLOGY"};

        // what if ->  a new department might be given out of the departments from list?
        String[] c = {"Cardiology", "Orthopaedics", "Gastroenterology"};
    }


    public static int findMaxPatient(String[] input) {

        Set<String> setInput = new TreeSet<String>(List.of(input));
//        Collections.addAll(setInput,input);
        // TODO we will continue on Friday!!

        if (setInput.size() == input.length|| input.length==1) {
            return 1;
        } else if (setInput.size()==1) {
            return input.length;
        }


        Map<String, Integer> inputMap = new HashMap<>();

        for (String str : input) {
            if (inputMap.containsKey(str)) {
                inputMap.put(str, inputMap.get(str) + 1);
            } else {
                inputMap.put(str, 1);
            }
        }


        return Collections.max(inputMap.values());
    }
}
