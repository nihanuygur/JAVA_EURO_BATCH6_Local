package days.day37_Arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        // primitive data types   -- byte short int long float double char boolean
        // non-primitive data types   -- String Array

        int intArray[];    //declaring array
        intArray = new int[20];  // allocating memory to array

        int[] intArray2 = new int[20]; // combining both statements in one

        int[] intArray3 = { 1,2,3,4,5,6,7,8,9,10 }; // no need to write -> new int[]
        // Declaring array literal

        int[] a = new int[10];
        System.out.println("a.length = " + a.length);

        int[] b = new int[100];

        a = b; //Compiler checks only type, not the size
        System.out.println("a.length = " + a.length);

        int number = 50;
        number = 100; // 50 is missed, we can store just one value
        int [] number2 ; // or -> int number2[]; declaration
        number2 = new int[5]; // int [] number2 = new int[];     You can do like that. 5 is the array number
        //           0 1 2 3 4 (index numbers)                   Each member of the array is an element

        number2[0]= 15;
        number2[1]= 25;
        number2[2]= 35;
        number2[3]= 45;
//        number2[4]= 55;

        /*The elements in the array allocated by new will automatically be initialized to
        zero (for numeric types),
        false (for boolean), or
        null (for reference types). Do refer to default array values in Java.
         */


        number2[3]=60; // if you want,you can change

        System.out.println("number2[3] = " + number2[3]);

        System.out.println("number2[4] = " + number2[4]); // we didn't initialize yet, but it will give us default value
        number2[4]= 55;
        System.out.println("number2 = " + number2); // it does not work
        System.out.println("Arrays.toString(number2) = " + Arrays.toString( number2));


        int array1[], array2;   //array1[] is an array while array2 is just a variable of type int
        int[] arr1, arr2;  //both arr1 and arr2 are arrays of int type
        closest(number2,3);
    }
    public static String closest(int[]arr,int num){
        int[]arr2=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        arr2[arr.length-1]=num;
        Arrays.sort(arr2);
        return Arrays.binarySearch(arr2,num)-1+" , "+Arrays.binarySearch(arr2,num);
    }

}
