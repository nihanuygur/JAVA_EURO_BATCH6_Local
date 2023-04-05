package days.day14_SwitchCaseStatement;

public class Days2 {
    public static void main(String[] args) {
        int dayNumber = 2; // re
        String week = "";
        String today = ";";
        switch (dayNumber) {
            case 7:
                System.out.println("Today is Sunday");
                today = "Sunday";
                break;
            case 6:
                System.out.println("Today is Saturday");
                today = "Saturday";
                break;
            case 5:
                System.out.println("Today is Friday");
                today = "Friday";
                break;
            case 4:
                System.out.println("Today is Thursday");
                today = "Thursday";
                break;
            case 3:
                System.out.println("Today is Wednesday");
                today = "Wednesday";
                break;
            case 2:
                System.out.println("Today is Tuesday");
                today = "Tuesday";
                break;
            case 1:
                System.out.println("Today is Monday");
                today = "Monday";
                break;
            default: // it is like 'else'
                System.out.println("the number is out of day, number didn't match");

        }

        if ( dayNumber == 1){
            today = "Monday";
        }else if ( dayNumber == 2) {
            today = "Tuesday";
        }else if ( dayNumber == 3) {
            today = "Wednesday";
        }else if ( dayNumber == 4) {
            today = "Thursday";
        }else if ( dayNumber == 5) {
            today = "Friday";
        }else if ( dayNumber == 6) {
            today = "Saturday";
        }else if ( dayNumber == 7) {
            today = "Sunday";
        }else {
            today = "Nothing";
        }
        System.out.println(today);

        boolean isWeekend = false;
        boolean isWeekday = false;
        if (dayNumber == 1 || dayNumber == 2 || dayNumber == 3 || dayNumber == 4 || dayNumber == 5 ) {
            isWeekend = false;
            isWeekday = true;

        }else if (dayNumber== 6 || dayNumber==7){
            isWeekend = true;
            isWeekday = false;
        }else {
            System.out.println("Wrong answer");
        }
        System.out.println("isWeekday = " + isWeekday);
        System.out.println("isWeekend = " + isWeekend);
    }
}
