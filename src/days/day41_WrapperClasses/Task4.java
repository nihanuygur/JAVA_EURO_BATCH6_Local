package days.day41_WrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {

        String str = "DC501GCCCA098911CZA936g";
        sortingSegments(str);
    }

    public static void sortingSegments(String s) {
        String newS = "";

        for (int i = 0; i < s.length() - 1; i++) {
            while (i != s.length() - 1) {
                if (Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i + 1)) ||
                        Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(i + 1))) {
                    newS += s.charAt(i);
                } else {
                    newS += s.charAt(i) + "-";
                }
                i++;
            }
            newS += s.charAt(i);
        }

        String[] list = newS.split("-");

        for (String c : list) {
            char[] clist = c.toCharArray();
            Arrays.sort(clist);
            System.out.print(clist);
        }
    }


// for (int i = 0; i < s.length() - 1; i++) {
//            if (Character.isDigit(s.charAt(i))) {
//                if (!Character.isDigit(s.charAt(i + 1))) {
//                    newS += s.charAt(i) + "-";
//                    if (i + 1  == s.length() - 1) {
//                        newS += s.charAt(i + 1);
//                    }
//                } else {
//                    newS += s.charAt(i);
//                    if (i + 1  == s.length() - 1) {
//                        newS +=  s.charAt(i + 1);
//                    }
//                }
//            } else {
//                if (!Character.isAlphabetic(s.charAt(i + 1))) {
//                    newS += s.charAt(i) + "-";
//                    if (i + 1  == s.length() - 1) {
//                        newS += s.charAt(i + 1);
//                    }
//                }  else {
//                    newS += s.charAt(i);
//                    if (i + 1  == s.length() - 1) {
//                        newS += s.charAt(i + 1);
//                    }
//                }
//            }
//        }
//        System.out.println(newS);
//        String[] list = newS.split("-");
//        System.out.println("Arrays.toString(list) = " + Arrays.toString(list));
//        for (String c : list) {
//            char[] clist = c.toCharArray();
//            Arrays.sort(clist);
//            System.out.print(clist);
//        }
//    }



}
