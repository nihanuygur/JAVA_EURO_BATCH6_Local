package days.day15_TernaryOperator;

public class TernarySamples {
    public static void main(String[] args) {
        int num = 331341;
        String IsEven = (num%2==0) ? (" is Even Number") :(" is Odd Number");
        System.out.println(num + IsEven);
        System.out.println(num + ((num%2==0) ? " is Even Number"  : " is Odd Number"));

        // pass limit is 50. Please inform the student how much he/she needs to pass the exam;

//        int mark = 110;
//        if (mark >=0 && mark <= 100) {
//            System.out.println((mark >= 50) ? ("Your mark is " + mark + " and you passed.")
//                    : ("Your mark is " + mark + " and you failed. You needed " + (50 - mark) + " more points to pass the exam."));
//        }else {
//            System.out.println("INVALID MARK !!");
//        }
//        int mark = 110;
//        if (mark < 0 || mark > 100) {
//            System.out.println("INVALID MARK !!");
//        } else {
//            System.out.println((mark >= 50) ? ("Your mark is " + mark + " and you passed.")
//                    : ("Your mark is " + mark + " and you failed. You needed " + (50 - mark) + " more points to pass the exam."));
//        }
//        int mark = 30;
//        String result;
//        if (mark >=0 && mark <= 100) {
//            result = (mark >= 50) ? ("Your mark is " + mark + " and you passed.")
//                    : ("Your mark is " + mark + " and you failed. You needed " + (50 - mark) + " more points to pass the exam.");
//        }else {
//            result = "INVALID MARK !!";
//        }
//        System.out.println(result);
//
//        // I love this -->
//        int mark = 20;
//
//        String passed = "Your mark is " + mark + " and you passed.";
//        String failed = "Your mark is " + mark + " and you failed. You needed " + (50 - mark) + " more points.";
//
//        String result = (mark >=0 && mark <=100)? ((mark >= 50) ? passed : failed): " Wrong Entry " ;
//
//
//        System.out.println(result);
        int mark = 60;
        String result = "Your mark is " + mark + " and you ";
        final int limit = 50;
        result = ( mark> 100 || mark< 0)?("INVALID MARK !!")
                : ((mark >= limit)?(result + " passed" ):(result + "failed. You needed "+(50 - mark)+" more points.")) ;
        System.out.println(result);

        int age= 20;
        String name = "John Cash";
        boolean isOk = true;
        final int ageLimit = 18;
        String result2 = "Hi " + name + " you are ";
        result2 = (age >=ageLimit && isOk ) ? (result2 + " selected as QA Engineer") : (result2 + " not selected as QA Engineer");
        System.out.println(result2);

        System.out.println(Math.abs(-6)); // a < 0 ? -a : a


//----------- alarmClock
        boolean vacation = false;
        int day = 6;
        String clock;
        if (day > 6 || day < 0){
            clock = "INVALID";
        } else if (day >= 1 && day <= 5){
            clock = (vacation) ? "10:00" : "7:00" ;
        } else {
            clock = (vacation) ? "OFF" : "10:00" ;
        }
        System.out.println("ALARM " + clock);





    }
}
