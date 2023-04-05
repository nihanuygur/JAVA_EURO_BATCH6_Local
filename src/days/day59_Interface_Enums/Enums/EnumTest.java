package days.day59_Interface_Enums.Enums;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Days.MONDAY = " + Days.MONDAY);

        Days days=Days.WEDNESDAY;
        boolean isWeekend ;


        switch (days){
            case FRIDAY:
            case WEDNESDAY:
            case THURSDAY:
            case TUESDAY:
            case MONDAY:
                isWeekend=false;
                break;
            case SATURDAY:
            case SUNDAY:
                isWeekend=true;
        }
        System.out.println("Arrays.toString(Days.values()) = " + Arrays.toString(Days.values())); // returns array
        for (Days d : Days.values()) {
            System.out.println(d);
        }
    }
}
