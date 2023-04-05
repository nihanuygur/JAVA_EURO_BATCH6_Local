package days.day13_IfElse;

public class CodeBat2 {
    public static void main(String[] args) {


       //////   alarmClock

        boolean vacation = true;
        int day = 7;
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


        ///////   More20

        int n = 24;
        if (n >= 0) {
            boolean more20 = n % 20 == 1 || n % 20 == 2 ;
            System.out.println(more20);
        }
        else {
            System.out.println("Negative Number");
        }


        ///////   SpecialEleven

        int number= -13;
        if (number >= 0) {
            boolean specialEleven = number % 11 == 1 || number % 11 == 0;
            System.out.println(specialEleven);
        }else {
            System.out.println("Negative Number ! ");
        }


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

        ///////   old35 alternative 2

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


        ///////   nearTen

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
