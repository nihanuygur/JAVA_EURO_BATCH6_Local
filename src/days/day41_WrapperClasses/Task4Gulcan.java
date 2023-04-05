package days.day41_WrapperClasses;

import java.util.Arrays;

public class Task4Gulcan {

        public static void main(String[] args) {
            String str = "DC501GCCCA098911";
            System.out.println("splitStr (str) = " + splitStr(str));
            String str2 = splitStr(str);
            String[] str3 = str2.split("-");
            System.out.println(Arrays.toString(str3));
            System.out.print("Output= ");

            for (int i = 0; i < str3.length; i++) {
                System.out.print(sort2(str3[i]));
            }
        }
        public static char[] sort2(String str4) {

            char[] list = str4.toCharArray();
            Arrays.sort(list);
            return list;
        }
        public static String splitStr(String str) {
            int n = str.length();
            String str2 = "";
            char[] c = new char[n];
            c = str.toCharArray();
            int isDigit = 0;
            int isLetter = 0;
            str2 += str.charAt(0);
            if (Character.isLetter(str.charAt(0)))
                isLetter = 1;
            else if (Character.isDigit((str.charAt(0))))
                isDigit = 1;

            for (int i = 1; i < n; i++) {
                if (Character.isDigit(str.charAt(i))) {
                    isDigit++;
                    isLetter = 0;
                    if (isDigit > 1) {
                        str2 += str.charAt(i);
                    } else str2 += "-" + str.charAt(i);
                } else if (Character.isLetter(str.charAt(i))) {
                    isLetter++;
                    isDigit = 0;
                    if (isLetter > 1) {
                        str2 += str.charAt(i);
                    } else str2 += "-" + str.charAt(i);
                }
            }
            return str2;
        }

    }

