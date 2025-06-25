package Lesson29;
import java.time.*;

public class LocalTimeMethods {
    public static void main(String[] args) {
        // LocalTime methods
        LocalTime lt = LocalTime.of(15, 30);
        System.out.println(lt); // 15:30

        // plusHours(), minusHours()
        lt = lt.plusHours(1);
        System.out.println(lt); // 16:30

        // plusMinutes(), minusMinutes()
        lt = lt.minusMinutes(15);
        System.out.println(lt); // 16:15

        // plusSeconds(), minusSeconds()
        lt = lt.plusSeconds(100);
        System.out.println(lt); // 16:16:40

        // plusNanos(), minusNanos()
        lt = lt.minusNanos(999999999);
        System.out.println(lt); // 16:16:39.000000001

        // example with method chaining
        lt = lt.plusHours(1).minusMinutes(50).minusSeconds(120).minusNanos(5);
        System.out.println(lt); // 16:24:38.999999996
    }
}
