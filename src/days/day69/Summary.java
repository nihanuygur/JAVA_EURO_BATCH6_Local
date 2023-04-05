package days.day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Summary {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,5,15,20,35,80,60));
        sumOfTheList(numbers);
        IntSummaryStatistics intSummaryStatistics =numbers.stream().mapToInt(x-> x).summaryStatistics();
        System.out.println("intSummaryStatistics = " + intSummaryStatistics);
    }


    public static void sumOfTheList(List<Integer> number){
        int sum=0;
        for(int i =0 ; i< number.size();i++){
            sum=sum+number.get(i);

        }
        System.out.println("sum = " + sum);
    }
}
