package days.group1Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertTask {
    /*
    1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
     Ex:
     arr = {10, 20, 30, 40, 50};

     insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

    1.2 Create the same function for double array, char array and string array
     */
    public static void main(String[] args) {
        int[] intA = {10, 20, 30, 40, 50};
        int[] arr2 = insertM(intA, 2, 100);
        System.out.println(Arrays.toString(arr2));

        double[] doubleA = {1.4, 5.0, 55.88, 7.5};
        System.out.println(Arrays.toString(insertM(doubleA, 1, 30.6)));

        char[] charA = {'a', '3', '!', '+'};
        System.out.println(Arrays.toString(insertM(charA, 2, '-')));

        String[] stringA = {"red", "blue", "white", "green"};
        System.out.println(insertM(stringA,2,"black"));
    }
    public static int[] insertM(int[] arr, int index, int element) { // LONG WAY
        int[] newA = new int[arr.length + 1];
        for (int i = 0; i < newA.length; i++) {
            if (i == index) {
                newA[i] = element;
            } else if (i > index) {
                newA[i] = arr[i - 1];
            } else {
                newA[i] = arr[i];
            }
        }
        /*
                       arr = {10, 20, 30, 40, 50};

     insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
         */
        return newA;
    }
    public static double[] insertM(double[] arr, int index, double element) { // SHORT WAY
        double[] newA = Arrays.copyOf(arr, arr.length + 1);
        newA[index] = element;
        for (int i = newA.length - 1; i > index; i--) {
            newA[i] = arr[i - 1];
        }
        return newA;

    }
    public static char[] insertM(char[] arr, int index, char element) {
        char[] newA = Arrays.copyOf(arr, arr.length + 1);
        newA[index] = element;
        for (int i = newA.length - 1; i > index; i--) {
            newA[i] = arr[i - 1];
        }
        return newA;

    }
    public static String[] insertM(String[] arr, int index, String element) {// ARRAYS -> ARRAYLIST
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add(index,element);
        return list.toArray(new String[arr.length+1]);
//        String[] newA = Arrays.copyOf(arr, arr.length + 1);
//        newA[index] = element;
//        for (int i = newA.length - 1; i > index; i--) {
//            newA[i] = arr[i - 1];
//        }
//        return newA;


    }


}
