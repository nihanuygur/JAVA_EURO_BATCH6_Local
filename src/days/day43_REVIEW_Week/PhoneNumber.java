package days.day43_REVIEW_Week;

public class PhoneNumber {
    public static void main(String[] args) {
        String str = "00-44 48 5555 8361 -1223 ";
        //004-448-555-583-61``
        int x = 0;
        String digit = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digit += str.charAt(i);
            }
            if (i == str.length() - 1) {
                break;
            }
        }
        System.out.println(digit);

        for (int i = 0; i < digit.length()-1; i += 3) {

            if (digit.length() % 3 == 0 && i == digit.length() - 3) {
                System.out.print(digit.substring(i));
            } else if (digit.length() % 3 == 1 && i == digit.length() - 4) {
                System.out.print(digit.substring(i, i + 2) + "-" + digit.substring(i + 2));
            } else if (digit.length() % 3 == 2 && i == digit.length() - 2) {
                System.out.print(digit.substring(i));
            } else {
                System.out.print(digit.substring(i, i + 3) + "-");
            }
        }

//        for (int i = 0; i < digit.length(); i += 3) {
//            if (digit.length() % 3 == 0) {
//                if (i != digit.length() - 3) {
//                    System.out.print(digit.substring(i, i + 3) + " ");
//                }else{
//
//                }
//            }else if (digit.length() % 3 == 2) {
//                if (i != digit.length() - 2) {
//                    System.out.print(digit.substring(i, i + 3) + " ");
//                } else {
//
//                }
//            } else if (digit.length() % 3 == 1) {
//                if (i != digit.length() - 4) {
//                    System.out.print(digit.substring(i, i + 3) + " ");
//                } else {
//                    System.out.print(digit.substring(i, i + 2) + " " + digit.substring(i + 2));
//                }
//            }
//        }
    }
}
