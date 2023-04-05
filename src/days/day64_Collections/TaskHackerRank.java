package days.day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskHackerRank {
    public static void main(String[] args) {
        List<Float> bags = new ArrayList<>(Arrays.asList(1.01f, 1.01f, 1.99f, 2.02f, 1.6f, 2.01f));
//        minTrip(bags);
        System.out.println(minTrip2(bags));
    }

    public static int minTrip2(List<Float> arr) {
        Collections.sort(arr);
        float maxBorder = 3.00f - arr.get(0);
        int trip= (int) arr.stream().filter(n->(n>maxBorder)).count();
        arr.removeIf(n -> (n > maxBorder));

        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            if (arr.get(left) + arr.get(right) <= 3) {
                left++;
            }
            right--;
            trip++;
        }
        return trip;
    }


    public static void minTrip(ArrayList<Float> arr) {
        Collections.sort(arr);
        ArrayList<Float> newArr = new ArrayList<>();

        int count = 0;
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                if ((arr.get(i) + arr.get(j)) <= 3.0f) {
                    newArr.add(arr.get(i));
                    newArr.add(arr.get(j));
                    size = j;
                    count++;
                    break;
                }
            }
        }

        System.out.println(arr);
        System.out.println(newArr);
        count += arr.size() - newArr.size();

        System.out.println(count);
    }
//    public static void minTrip2(ArrayList<Float> arr) {
//        Collections.sort(arr);
//        float max = 3.00f - arr.get(0);
//        float border = arr.get(arr.size() - 1);
//        for (Float aFloat : arr) {
//            if (aFloat > max) {
//                border = aFloat;
//                break;
//            }
//        }
//        ArrayList<Float> newArr2 = new ArrayList<>();
//        int size = arr.indexOf(border) + 1;
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            for (int j = size - 1; j > 0; j--) {
//                if ((arr.get(i) + arr.get(j)) <= 3.0f) {
//                    newArr2.add(arr.get(i));
//                    newArr2.add(arr.get(j));
//                    size = j;
//                    count++;
//                    break;
//                }
//            }
//        }
//
//        count += arr.size() - newArr2.size();
//        System.out.println(count);
//    }

//        System.out.println(arr);
//        System.out.println(newArr2);
//        count += arr.size() - newArr2.size();
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
