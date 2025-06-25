package Lesson29;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExamples {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, Month.MAY, 31);
        LocalTime lt = LocalTime.of(15, 30);
        LocalDateTime ldt = LocalDateTime.of(2013, Month.SEPTEMBER, 10, 17, 30);
        DateTimeFormatter dtf = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println("Before formatting: " + ld); // 2014-05-31
        System.out.println("After formatting: " + ld.format(dtf)); // 2014-W22-6

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Before formatting: " + ld); // 2014-05-31
        System.out.println("After formatting: " + ld.format(shortFormatter)); // 5/31/14

        // this works as well
        System.out.println(shortFormatter.format(ld));

        DateTimeFormatter longFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        System.out.println(longFormatter.format(ldt)); // 09/10/2013 17:30
    }
}
