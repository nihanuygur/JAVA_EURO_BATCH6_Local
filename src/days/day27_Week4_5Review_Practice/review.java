package days.day27_Week4_5Review_Practice;

public class review {
    public static void main(String[] args) {

        int ageIdent = age(10, 22);
        System.out.println(ageIdent);
        calender(7,7);

    }

    public static int age(int month, int year) {
        if (month < 3) {
            return year + 50 - 1;
        } else if (month < 9) {
            return year;
        } else {
            return year + 50;
        }
    }

    public static void calender(int week,int day) {
        for (int i = 1; i <= week; i++) {
            System.out.println("Week: " + i );
            for (int j = 1; j <= day; j++) {
                System.out.println("\tDay: " + j);
            }
        }
    }



}
