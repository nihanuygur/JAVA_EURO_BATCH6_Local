package days.day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Float> bags = new ArrayList<>(Arrays.asList(2.0f,2.0f,2.0f,2.0f,2.0f,2.0f,2.0f,2.0f,2.0f,2.0f));
        minTrip(bags);

//        float[] bags2 = {1.40f, 2.5f, 2.1f, 1.1f, 1.5f};
//        minTrip(bags2);


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

        count += arr.size() - newArr.size();

        System.out.println(count);
    }

    public static void minTrip(float[] arr) { // overloading float []
        Arrays.sort(arr);
        ArrayList<Float> newArr = new ArrayList<>();

        int count = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                if ((arr[i] + arr[j]) <= 3.0f) {
                    newArr.add(arr[i]);
                    newArr.add(arr[j]);
                    size = j;
                    count++;
                    break;
                }
            }
        }

        count += arr.length - newArr.size();

        System.out.println(count);
    }

}
// input -> float array
// 1 <= bag number <= 1000
// 1.01 <= weigh <= 3.00
//                          1.01 ... 1.49 - 1.50 - 1.51 ... 1.99  <  ...  <=  3.00
// 1.01 + 1.99 == 3.00 (this range's sum might be 3.00)  _|             |_ each of them will be separately carried
// sort element min to max
// the border -> ( 3.00 -  (min element) ) -> min .... border .... max
//                                                  1    |      2
//        check sum is <=3.00 (Y: collect two of them) _| |_ each of them will be separately carried
//                            (N: each of them will be separately carried)
// [1.41, 1.44, 1.47, 1.51, 1.61, 1.9, 2.4]
//
// [1.41, 1.44, 1.47, 1.51,         1.61, 1.9, 2.4]
//  0     1     2      3              4    5    6
//  arr(0) + arr(3)
//  arr(1) + arr(2)