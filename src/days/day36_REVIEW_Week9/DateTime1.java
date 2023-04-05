package days.day36_REVIEW_Week9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTime1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        yourAge(1980);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM-yyy");
        System.out.println(localDate.format(dateTimeFormatter));
        Period period = Period.of(1989,06,01);
        System.out.println(period.subtractFrom(localDate));
    }

    public static void yourAge(int birthYear) {
        int age = 2022 - birthYear;
        LocalDate date = LocalDate.now();
        System.out.println(age);
    }
}
