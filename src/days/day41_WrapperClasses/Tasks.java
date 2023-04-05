package days.day41_WrapperClasses;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
//        Task
//        ! Write a method that can find the minimum number from an int Array Ex: maxValue(int [] n)
        int[] n = {1, 2, 3, 4, 5};
        task2(n);
        task1(n);
        String password = "123ABC+";
        task3(password);
        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        task3(str2);
        task3(str1);
        String s="DC501GCCCA098911";
//        task4(s);
        task5(s);
    }
    public static void task1(int[] n) {
        Integer max = Integer.MIN_VALUE;
//        System.out.println("max value is " + max);
        for (int i : n) {
//
            max = Math.max(max, i);
        }
        System.out.println("max value is " + max);
    }

    public static void task2(int[] n) {
        Integer min = Integer.MAX_VALUE;
//        System.out.println("min value is " + min);
        for (int i : n) {
//            if (i < min) {
//                min = i;
//            }
            min = Math.min(min, i);
        }
        System.out.println("min value is " + min);
    }
    public static void task3(String s) {
        String code = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){ // if(str.charAt(i)<='9' && str.charAt(i)>='0')
                code += s.charAt(i);
//                System.out.print(s.charAt(i)); or directly print
            }
        }
        System.out.println("Code = " + code);
    }
    public static void  task4(String s){
        String str="";
        int n =s.length();
        String newS= "";
        String [] sArray = new String[n];
        for (int i = 0; i < s.length(); i++) {
            while(Character.isAlphabetic(s.charAt(i))){
                str+=s.charAt(i);

                if(Character.isDigit(s.charAt(i+1))){
                    break;
                }
            }
            String[] splitStr = str.split("");
            Arrays.sort(splitStr);
            newS+=Arrays.toString(splitStr);
            str="";
            while(Character.isDigit(s.charAt(i))){
                str+=s.charAt(i);

                if(Character.isAlphabetic(s.charAt(i+1))){
                    break;
                }
            }
            splitStr = str.split("");
            Arrays.sort(splitStr);
            newS+=Arrays.toString(splitStr);
            str="";
        }System.out.println(newS);

    }
    public static void task5(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
             if (Character.isDigit(s.charAt(i))){
                 sum += Character.getNumericValue(s.charAt(i));
//                 sum += Integer.parseInt(String.valueOf(s.charAt(i))); // == Integer.parseInt(""+s.charAt(i));
//                 sum += Integer.valueOf(s.substring(i,i+1));
             }
        }
        System.out.println(sum);
    }


}
