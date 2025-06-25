package Lesson29;
import java.time.*;

public class GetDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024, Month.OCTOBER, 31);
        LocalDateTime ldt = LocalDateTime.of(2024, Month.OCTOBER, 31, 23, 59);

        // getDayOfWeek()
        System.out.println(ld.getDayOfWeek()); // THURSDAY
        System.out.println(ldt.getDayOfWeek()); // THURSDAY

        // getDayOfMonth()
        System.out.println(ldt.getDayOfMonth()); // 31

        // getDayOfYear()
        System.out.println(ld.getDayOfYear()); // 305

        // getMonth()
        System.out.println(ld.getMonth()); // OCTOBER

        // getMonthValue()
        System.out.println(ld.getMonthValue()); // 10

        // getYear()
        System.out.println(ld.getYear()); // 2024
    }
}
