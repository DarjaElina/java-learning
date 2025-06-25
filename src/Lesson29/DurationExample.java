package Lesson29;

import java.time.*;

public class DurationExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        Duration d = Duration.ofHours(24);

        // we can use plus() and minus() Duration on LocalTime and LocalDateTime objects, but not on LocalDate
        LocalDate ld = startDate.plus(d);
        System.out.println(ld); // 💥 RuntimeException UnsupportedTemporalTypeException: Unsupported unit: Seconds

    }
}
