package Lesson29;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Parse {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", dtf);
        System.out.println(date.format(dtf));
        LocalDate date2 = LocalDate.parse("2015-01-02");
        System.out.println(date2.format(dtf));
    }
}
