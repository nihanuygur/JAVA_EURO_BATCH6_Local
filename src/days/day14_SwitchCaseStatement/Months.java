package days.day14_SwitchCaseStatement;

public class Months {
    public static void main(String[] args) {
        int monthNumber = 1;
        String month = "";

        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("Invalid");

        }
        System.out.println("This month is " + month);


        String season = "";

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;

            default:
                System.out.println("Invalid");

        }
        System.out.println(month +  " is a " + season + " month");

        switch (month) {
            case "December" :
            case "January" :
            case "February":
                season = "Winter";
                break;
            case "March":
            case "April":
            case "May":
                season = "Spring";
                break;
            case "June":
            case "July":
            case "August":
                season = "Summer";
                break;
            case "September":
            case "October":
            case "November":
                season = "Autumn";
                break;

            default:
                System.out.println("Invalid");

        }
        System.out.println(month +  " is a " + season + " month");




    }
}
