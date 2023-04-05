package days.day14_SwitchCaseStatement;

public class days {
    public static void main(String[] args) {

        int b = 10;

        if (b > 7) {
            int dayNumber = 9;
            dayNumber = 5;
        }


        // Monday 1 / Tuesday 2 / Wednesday 3 / Thursday 4 / Friday 5 / Saturday 6 / Sunday 7
        int dayNumber = 2; // re
        String week = "";
        String today = ";";
        switch (dayNumber) {
            case 7:
                System.out.println("Today is Sunday");
                today = "Sunday";
                week = "Weekend2";
                break;
            case 6:
                System.out.println("Today is Saturday");
                today = "Saturday";
                week = "Weekend1";
                break;
            case 5:
                System.out.println("Today is Friday");
                today = "Friday";
                week = "Weekday5";
                break;
            case 4:
                System.out.println("Today is Thursday");
                today = "Thursday";
                week = "Weekday4";
                break;
            case 3:
                System.out.println("Today is Wednesday");
                today = "Wednesday";
                week = "Weekday3";
                break;
            case 2:
                System.out.println("Today is Tuesday");
                today = "Tuesday";
                week = "Weekday2";
                break;
            case 1:
                System.out.println("Today is Monday");
                today = "Monday";
                week = "Weekday1";
                break;
            default: // it is like 'else'
                System.out.println("the number is out of day, number didn't match");

        }
        boolean IsWeekend = false;
        boolean IsWeekday = true;
        switch (dayNumber) {
            case 7:

            case 6:
                IsWeekend = true;
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                IsWeekday = true;
                break;

        }
        String weekText = "";
        if (IsWeekend) {
            System.out.println(" is not weekend");


        }
    }
}
