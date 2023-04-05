package days.day10_LogicalOperators;

public class LogicalOperators2 {
    public static void main(String[] args) {
        // weekday monday or tuesday or wednesday or thursday or friday
        // weekend saturday or sunday
        System.out.println(3 > 1 || 3 > 2);
 //                         true    true  ---> true
        System.out.println(3 > 1 || 3 > 5);
    //                      true    false ---> true
        System.out.println(3 > 10 || 3 > 2);
        //                  false   true  ---> true
        System.out.println(3 > 10 || 3 > 20);
        //                  false   false ---> false

        int a = 20;
        System.out.println( 20> 3 || a > 10);
        System.out.println( 20> 3 || ++a > 10);// will ignore the second statement because the first statement true
        //                                      for or operator if only 1 of the result is true then result will be true
        System.out.println("a = " + a);
        System.out.println( 20< 3 || a < 30 || ++a < 10); // it found true, so it didn't control the next condition
        System.out.println("a = " + a);
        System.out.println( 20< 3 || ++a > 10); // it found true, so it didn't control the next condition
        System.out.println("a = " + a);
        System.out.println( 20> 3 | ++a > 10); // it completed to control all conditions
        System.out.println("a = " + a);
        // weekend saturday or sunday

        // is it weekend ?
        //1
        String weekend;
        weekend = " saturday" + "sunday";
        System.out.println(weekend=="wednesday");

        //2
        String weekend2 = "saturday";
        boolean isWeekend2 = weekend2 == "saturday" || weekend2 == "sunday";
        System.out.println("isWeekend2aa = " + isWeekend2);

        //3
        boolean isWeekend;
        boolean isSunday = false;
        boolean isSaturday = true;
        isWeekend = isSunday || isSaturday;
        System.out.println("isWeekend = " + isWeekend);
        isWeekend = isSunday && isSaturday;
        System.out.println("isWeekend = " + isWeekend);

        // if number is bigger than 9 and if the number < 100, the number is two digit
        int number = 120;
        boolean isNumber2Digit = number>9 && number<100;
        boolean isNumber2Digit2 = number>=10 && number<=99;

        System.out.println(isNumber2Digit);
        
        // number is between 20 40 or 60 80
        number = 55;
        boolean result = (20 < number && number < 40) || (60 < number && number < 80);
        System.out.println("result = " + result);

        // number is even or not
        number= 60;
        boolean isEven = number%2==0; // (number%2 != 1);
        System.out.println(isEven);





    }
}
