package Lesson29;
import java.time.*;

public class GetTime {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(20, 30, 45, 1);
        LocalDateTime ldt = LocalDateTime.of(2021, Month.JANUARY, 20, 20, 45, 1);

        // getNano()
        System.out.println(lt.getNano()); // 1

        // getSecond()
        System.out.println(lt.getSecond()); // 45
        System.out.println(ldt.getMinute()); // 45

        // getHour()
        System.out.println(ldt.getHour()); // 20
        System.out.println(lt.getHour()); // 20
    }
}
