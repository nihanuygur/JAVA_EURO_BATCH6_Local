package days.day36_REVIEW_Week9;

public class Strings {
    public static void main(String[] args) {
        String city = "London";
        //             012345
        String country = new String("Germany"); // String  is a class and object
        //                                  0123456
        System.out.println(city.substring(0, 2)); // Lo
        System.out.println(city.charAt(0));
        System.out.println(city.length());
        country.substring(3); // "many"

        // we don't want to write first letter and concatenation them
        String a = "Hello";
        String b = "There";
        String strW = a.substring(1).concat(b.substring(1));
        System.out.println(strW);

        // first 2 char to end
        String str = "Hello";
        String left2 = str.substring(2).concat(str.substring(0, 2));
        System.out.println(left2);

        // last 2 char to beginning
        str = "Hello";
        String right2 = str.substring(str.length() - 2).concat(str.substring(0, str.length() - 2));
        System.out.println(right2);
/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
Go...Save, Compile, Run (ctrl-enter)


public String theEnd(String str, boolean front) {

}



 */

        boolean endsLy = false;
        String str2 = "oddly";
        // LONG WAY
        String last2 = str.substring(str2.length() - 2);
        if (last2.equals("ly")) {
            endsLy = true;
        }
        System.out.println(endsLy);

        // SHORT WAY
        if (str2.endsWith("ly")) {
            endsLy = true;
        }
        System.out.println(endsLy);

        str = "redxyz";
        String seeColor = "";
        if (str.startsWith("red")) {
            seeColor = "red";
        } else if (str.startsWith("blue")) {
            seeColor = "blue";
        }
        System.out.println(seeColor);

//        str ="edited";
//        if (str.substring(0, 2).equals(str.substring(str.length() - 2)){
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

        str = "abcdffghjklassdeftrhukisaasqew";
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {

            if (!reverse.contains("" + str.charAt(i))) {
                reverse += str.charAt(i); //str.substring(i, i + 1);
            }
        }
        System.out.println(reverse);

        str = "abc";
        str2 = "";
        String conCat = "";
        if (str2.length() == 0) {
            conCat = str;
        } else if (str.endsWith(str2.substring(0, 1))) {
            conCat = str.concat(str2.substring(1));
        } else {
            conCat = str.concat(str2);
        }
        System.out.println(conCat);

        str= "hxello";
        if (str.startsWith("x")||str.substring(1,2).equals("x")){
            str.replace("x","");
            System.out.println(str);
        }else {
            System.out.println(str);
        }
//        if (str.startsWith("x")){
//            if (str.substring(1,2).equals("x")) {
//                System.out.println(str.substring(2));
//            }
//            System.out.println(str.substring(1));
//        } else if (str.substring(1,2).equals("x")) {
//            System.out.println(str.substring(0,1).concat(str.substring(2)));
//        }else {
//            System.out.println(str);
//        }
//        if(str.length()>2 && str.endsWith(str.substring(0,2))){
//            str = str.substring(2);
//        }
//        return str;
    }



}
