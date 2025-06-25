package Lesson29;

import java.time.LocalDate;

public class LocalDateMethods {
    public static void main(String[] args) {
        // LocalDate methods
        // plusDays()
        LocalDate ld = LocalDate.of(2014, 5, 15);
        System.out.println(ld); // 2014-05-15
        ld.plusDays(5);
        System.out.println(ld); // ❗️still 2014-05-15, because LocalDate is immutable
        ld = ld.plusDays(5);
        System.out.println(ld); // now prints 2014-05-20

        // minusDays()
        ld = ld.minusDays(30);
        System.out.println(ld); // 2014-04-20

        // plusWeeks(), minusWeeks()
        ld = ld.minusWeeks(10);
        System.out.println(ld); // 2014-02-09

        // plusMonth(), minusMonth()
        ld = ld.minusMonths(1);
        System.out.println(ld); // 2014-01-09

        // plusYears(), minusYears()
        ld = ld.minusYears(1);
        System.out.println(ld); // 2013-01-09

    }
}
