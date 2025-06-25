package Lesson29;
import java.time.*;

public class IsAfter_IsBefore {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, Month.MAY, 31);
        LocalDate ld2 = LocalDate.of(2012, Month.JUNE, 18);

        LocalTime lt = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(3, 5, 18, 55598348);

        LocalDateTime ldt = LocalDateTime.of(2013, Month.SEPTEMBER, 10, 17, 30);
        LocalDateTime ldt1 = LocalDateTime.of(2013, Month.SEPTEMBER, 10, 17, 30, 9);

        // methods for comparing date and time objects
        // ifAfter(), isBefore()

        System.out.println(ld.isAfter(ld2)); // true
        System.out.println(ld.isBefore(ld2)); // false

        System.out.println(lt.isAfter(lt2)); // true
        System.out.println(lt.isBefore(lt2)); // false

        System.out.println(ldt.isAfter(ldt1)); // false
        System.out.println(ldt.isBefore(ldt1)); // true

        // System.out.println(ld.isAfter(lt)); ❌ compiler error
    }
}
