package Lesson29;

import java.time.*;

public class SchoolGroup {
    static void changeGroupPresident(LocalDate startDate, LocalDate endDate) {
        LocalDate date = startDate;
        while (date.isBefore(endDate)) {
            System.out.println("📆 Date is: " + date + ", Time to change our group president 🧑‍🏫👩‍🏫");
            date = date.plusMonths(1);
        }
    }

    // why this is not the best implementation:
    // if we decide that the president should change every week, or every 2 month,
    // we will have to rewrite it completely

    // better implementation using Period class 👇

    static void changeGroupPresident(LocalDate startDate, LocalDate endDate, Period period) {
        LocalDate date = startDate;
        while (date.isBefore(endDate)) {
            System.out.println("📆 Date is: " + date + ", Time to change our group president 🧑‍🏫👩‍🏫");
            date = date.plus(period);
        }
    }

    public static void main(String[] args) {
        // version 1 with hardcoded month
        LocalDate startDate = LocalDate.of(2025, Month.AUGUST, 1);
        LocalDate endDate = LocalDate.of(2026, Month.MAY, 31);
        // changeGroupPresident(startDate, endDate);

        // version 2 with flexible Period
        Period period = Period.ofMonths(3);
        changeGroupPresident(startDate, endDate, period); // group choose new president every 3 months
    }
}
