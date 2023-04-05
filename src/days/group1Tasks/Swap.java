package days.group1Tasks;

import java.util.Arrays;

public  class Swap {
    public static void main(String[] args) {
    /*
    Swap Task:
         1-Create a method named swap that passes three parameters: integer array, integer i, integer j.
         the method swaps the element at index i with the element at index j, and returns the new array
                Ex:
                arr = {10, 20, 30, 40, 50};
                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
        2- Create the same function for double array, char array and string array

     */
        int [] numbers = {10, 20, 30, 40, 50};
        swapMethod(numbers,2,4);
    }
    public static void swapMethod(int[] list, int i ,int j){

        int num = list[i];
        list[i]=list[j];
        list[j]=num;
        System.out.println(Arrays.toString(list));
    }
}
