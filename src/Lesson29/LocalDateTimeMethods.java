package Lesson29;

import java.time.*;

public class LocalDateTimeMethods {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2013, Month.SEPTEMBER, 10, 17, 30);
        System.out.println(ldt); // 2013-09-10T17:30

        ldt = ldt.plusYears(1).minusMonths(2).plusMinutes(20).minusSeconds(30);
        System.out.println(ldt); // 2014-07-10T17:49:30
    }
}
