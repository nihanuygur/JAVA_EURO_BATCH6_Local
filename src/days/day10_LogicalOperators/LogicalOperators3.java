package days.day10_LogicalOperators;

public class LogicalOperators3 {
    public static void main(String[] args) {
        boolean not = true;
        System.out.println("not = " + not);
        System.out.println("!not = " + !not);
        System.out.println(!false);
        int a =20;
        System.out.println(a==20);
        System.out.println(!(a==20));
        System.out.println(a!=20);

        int number= 21;
        boolean isEven = number%2==0; // (number%2 != 1);
        System.out.println("isEven = " + isEven);
        boolean isOdd = !isEven;
        System.out.println("isOdd = " + isOdd);

        boolean isWeekend;
        boolean isSunday = false;
        boolean isSaturday = true;
        isWeekend = isSunday || isSaturday;
        System.out.println("isWeekend = " + isWeekend);
        isWeekend = isSunday && isSaturday;
        System.out.println("isWeekend = " + isWeekend);
        boolean isWeekdays = !isWeekend;
        System.out.println("isWeekdays = " + isWeekdays);

        String weekend2 = "wednesday";
        boolean isWeekend2 = weekend2 == "saturday" + "sunday";
        System.out.println("isWeekend2 = " + isWeekend2);
        boolean isWeekday2 = !isWeekend2;
        System.out.println("isWeekday2 = " + isWeekday2);

    }
}
