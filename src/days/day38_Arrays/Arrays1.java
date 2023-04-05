package days.day38_Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        System.out.println("numbers.length = " + numbers.length);
        numbers[0]= 10;
        numbers[2]= 80;
        numbers[1]= 30;
        numbers[3]= 50;
        numbers[4]= 90;
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("numbers[2] = " + numbers[2]);

        for (int num : numbers) {
            System.out.println(num);
        }

//      give me the numbers greater than 50
        for (int num : numbers) {
            if (num>50){
                System.out.println("num = " + num);
            }
        }
        int n=Integer.parseInt("24");
        System.out.println("n = " + n);

//      give me the greatest number
        int max = numbers[0];
        for (int num : numbers) {
            if (num>max){
                max=num;
            }
        }
        System.out.println("max = " + max);

        // give me the smallest number
        int min = numbers[0];
        for (int num : numbers) {
            if (min>num){
                max=num;
            }
        }
        System.out.println("min = " + min);



    }
}
