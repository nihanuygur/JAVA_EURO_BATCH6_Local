package days.group1Tasks;

import java.util.Arrays;

public class Insert {
    /*
    1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
     Ex:
   arr = {10, 20, 30, 40, 50};

   insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

1.2 Create the same function for double array, char array and string array
     */
    public static void main(String[] args) {
        int[] array={10, 20, 30, 40, 50};
        int [] newArray =insert(array, 2, 100);
        System.out.println("newArray = " + Arrays.toString(newArray));

        int [] arr1= {10,20,30,40,50,69,36,45};
        int [] arr2 = new int[arr1.length];
        for(int i=arr1.length-1;i>=0;i--)
        {
            arr2[arr1.length-1-i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static int[]  insert(int[]arr, int index, int element){
        arr[index]=element;
        return arr;
    }




}
