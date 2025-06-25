package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodExamples {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 15);
        LocalTime localTime = LocalTime.of(20, 30);

        // we cannot add/subtract Period to/from LocalTime
        // localTime.plus(period); 💥 RuntimeException: UnsupportedTemporalTypeException: Unsupported unit: Months

        // we cannot use method chaining with Period.of()
        Period tenDays = Period.ofYears(1).ofMonths(2).ofDays(10);
        // we could think that this 👆 will be a period of 1 year, 2 months and 10 days,
        // but only the last of() will we taken into account

        LocalDate startDate = LocalDate.of(2020, 1, 1);
        System.out.println(startDate.plus(tenDays)); // 2020-01-11
    }
}
