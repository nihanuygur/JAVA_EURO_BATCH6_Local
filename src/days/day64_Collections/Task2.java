package days.day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Float> bags = new ArrayList<>(Arrays.asList(1.1f,1.1f,1.6f,1.9f));
//        minTrip(bags);
        bag(bags);
    }

    public static void bag(ArrayList<Float> arr) {

        Collections.sort(arr);
        ArrayList<Float> newArr = new ArrayList<>();
        System.out.println("arr = " + arr);
        int count = 0;
        int left = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) <= 1.99) {
                if (i != left && arr.get(i) + arr.get(left) <= 3.00F) {
                    newArr.add(arr.get(i));
                    newArr.add(arr.get(left));
                    left++;
                    count++;
                }
                break;
            }
        }
        System.out.println(newArr);
        for (Float aFloat : newArr) {
            if (arr.contains(aFloat)){
                arr.remove(aFloat);
            }
        }
//        arr.removeAll(newArr);
        System.out.println(arr);
        count += arr.size();
        System.out.println("count = " + count);
    }
//    public static void minTrip(ArrayList<Float> arr) {
//        Collections.sort(arr);
//        float max = 3.00f - arr.get(0);
//        float border = arr.get(arr.size() - 1);
//        for (Float aFloat : arr) {
//            if (aFloat > max) {
//                border = aFloat;
//                break;
//            }
//        }
//
//        ArrayList<Float> newArr = new ArrayList<>();
//        System.out.println(arr);
//
//        int count = 0;
//        int size = arr.indexOf(border);
//        for (int i = 0; i < size; i++) {
//            for (int j = size - 1; j >= 0; j--) {
//                if ((arr.get(i) + arr.get(j)) <= 3.0f) {
//                    newArr.add(arr.get(i));
//                    newArr.add(arr.get(j));
//                    size = j;
//                    count++;
//                    break;
//                }
//                break;
//            }
//        }
//
//        System.out.println(newArr);
//        arr.removeAll(newArr);
//        count += arr.size();
//        System.out.println(count);

    // input -> float array
    // 1 <= bag number <= 1000
    // 1.01 <= weigh <= 3.00
    // 1.01 ... 1.49 - 1.50 - 1.51 ... 1.99 < ... <= 3.00
    //     1.01 + 1.99 == 3.00                 |_ each of them will be separately carried
    // sort element min to max
    // find the border -> ( 3.00 -  (min element) ) -> min .... border .... max
    //                                                      1     |      2
    //             check sum is <=3.00 (Y: collect two of them) _| |_ each of them will be separately carried
    //                                 (N: each of them will be separately carried)
    // [1.41, 1.44, 1.47, 1.51, 1.61, 1.9, 2.4]
    //       3.00-1.41(min) = 1.59
    // [1.41, 1.44, 1.47, 1.51,         1.61, 1.9, 2.4]
    //  0     1     2      3              4    5    6
    //  arr(0) + arr(3)
    //  arr(1) + arr(2)


}



