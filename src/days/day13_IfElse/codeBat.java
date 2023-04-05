package days.day13_IfElse;

public class codeBat {
    public static void main(String[] args) {
//        alarmClock -- Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
//        and a boolean indicating if we are on vacation, return a string of the form
//        "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
//        and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays
//        it should be "10:00" and weekends it should be "off".

//    alarmClock(1, false) → "7:00"
//    alarmClock(5, false) → "7:00"
//    alarmClock(0, false) → "10:00"

//----------- alarmClock
        boolean vacation = true;
        int day = 3;
        String clock;
        if (day > 6 || day < 0){
            clock = "INVALID";
        } else if (day >= 1 && day <= 5){
            if (!vacation) {
                clock = "7:00";
            } else {
                clock = "10:00";
            }
        } else {
            if (!vacation){
                clock = "10:00";
            } else {
                clock = "OFF";
            }
        }
        System.out.println("ALARM " + clock);


        System.out.println("////////////////////////////More20");


//        More20 --- Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

//        more20(20) → false
//        more20(21) → true
//        more20(22) → true

//----------- More20
        int n = 22;
        if (n >= 0) {
            boolean more20 = n % 20 == 1 || n % 20 == 2 ;
            System.out.println(more20);
        }
        else {
            System.out.println("Negative Number");
        }


//        ///////////
//        if (n >= 0) {
//            if ( n % 20 == 1 || n % 20 == 2){
//                more20 = true;
//            } else {
//                more20 = false;
//            }
//        }
//        else {
//
//        }
//        System.out.println(more20);

        System.out.println("////////////////////////////SpecialEleven");


//        SpecialEleven -- We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
//        Return true if the given non-negative number is special. Use the % "mod" operator

//        specialEleven(22) → true
//        specialEleven(23) → true
//        specialEleven(24) → false

//----------- SpecialEleven
        int number= -13;
        if (number >= 0) {
            boolean specialEleven = number % 11 == 1 || number % 11 == 0;
            System.out.println(specialEleven);
        }else {
            System.out.println("Negative Number ! ");
        }


        System.out.println("////////////////////////////old35");

//        old35 --- Return true if the given non-negative number is a multiple of 3 or 5, but not both.
//        Use the % "mod" operator

//        old35(3) → true
//        old35(10) → true
//        old35(15) → false

        ///////   old35 alternative 1

        int n2 = 10;
        boolean old35 = true;
        if (n2 <0) {
            System.out.println("Negative Number !");
        }else if (( n2 % 3== 0 && n2 % 5 != 0) || ( n2 % 3!= 0 && n2 % 5 == 0)) {
            old35 = true;
        }else {
            old35 = false;
        }
        System.out.println(old35);

//        ///////   old35 alternative 2
//
//        int n2 = 10;
//        boolean old35 = true;
//        if (n2 <0) {
//            System.out.println("Negative Number !");
//        }else if (( n2 % 3== 0 || n2 % 5 == 0)) {
//            if ( n2 % 3== 0 && n2 % 5 == 0) {
//                old35 = false;
//            }else{
//                old35 = true;
//            }
//        }else {
//            old35 = false;
//        }
//        System.out.println(old35);

//            int n2 = 8;
//            boolean old35;
//
//            if (n2 >= 0 && (n2 % 3 == 0 || n2 % 5 == 0 )){
//                if (n2 % 3 == 0 && n2 % 5 == 0 ) {
//                    old35 = false;
//                }else {
//                    old35 = true;
//                    System.out.println("n2" + old35);
//                } else {
//                    System.out.println("n2 Negative number");
//                }

        System.out.println("////////////////////////////nearTen");

//        nearTen -- Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
//        Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

//        nearTen(12) → true
//        nearTen(17) → false
//        nearTen(19) → true

//----------- nearTen
        int num = 27;
        int remainder = num % 10;
        if (num>=0) {
            boolean nearTen = (remainder >=8 || remainder <=2);
            System.out.println(nearTen);
        }else {
            System.out.println("Negative Number ! ");
        }













    }


}
