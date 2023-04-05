package days.group1Tasks;

import java.util.Arrays;
import java.util.Scanner;
public class Replt {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        if(name.contains("@")){
//            String [] split = name.split("@");
//            System.out.println("email id: "+split[0]);
//            System.out.println("email domain: "+split[1]);
//        }else{
//            System.out.println("It doesn't contain @");
//
//        }
        Scanner myObj = new Scanner(System.in);
        // System.out.println("Enter str1");
        String str1 = myObj.nextLine();
        // System.out.println("Enter str2");
        String str2 = myObj.nextLine();
        String[] arr1 = str1.split("");
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        String[] arr2 = str2.split("");
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

        Arrays.sort(arr1);
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        if (arr1.equals(arr2)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


}

