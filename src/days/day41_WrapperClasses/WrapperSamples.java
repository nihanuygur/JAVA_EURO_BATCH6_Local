package days.day41_WrapperClasses;

public class WrapperSamples {
    public static void main(String[] args) {
        System.out.println(1 == 1.0); // true - > auto boxing
        Integer i = Integer.valueOf("128");
        Integer j = Integer.valueOf("128");
        System.out.println("i==j = " + (i == j)); // false (byte)
        System.out.println("i.equals(j) = " + i.equals(j)); // prefer to use

        String str1 = "2";
        String str2 = new String("2");
        System.out.println("str1==str2 = " + (str1 == str2)); // false (byte)
        System.out.println("str1.equals(str2) = " + str1.equals(str2)); // prefer to use
        String actualResult = "1-16 of 940 results for";
        String resultNumber = actualResult.substring(8, actualResult.length()-12); //actualResult.substring(8, 11);
               resultNumber = actualResult.substring(actualResult.indexOf("f")+2, actualResult.indexOf("r")-1); //actualResult.substring(8, 11);
        Integer obj1 = Integer.valueOf(resultNumber);
        System.out.println("obj1 = " + obj1);
        System.out.println("resultNumber = " + resultNumber);


        int value2 =  111;
        String str = String.valueOf(value2);

    }
}
