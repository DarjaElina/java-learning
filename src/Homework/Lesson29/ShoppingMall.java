package Homework.Lesson29;
import java.time.*;
import java.time.format.*;

public class ShoppingMall {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/dd");

    void shift(LocalDateTime ldt1, LocalDateTime ldt2, Period period, Duration duration) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("We are working from: " + ldt1.format(formatter));
            ldt1 = ldt1.plus(period);
            System.out.println("To: " + ldt1.format(formatter2));
            System.out.println("We are closed from: " + ldt1.format(formatter));
            ldt2 = ldt2.plus(duration);
            System.out.println("To: " + ldt2.format(formatter2));
        }
    }

    public static void main(String[] args) {
        ShoppingMall shoppingMall = new ShoppingMall();
        LocalDateTime ldt1 = LocalDateTime.of(2025, Month.FEBRUARY, 1, 0, 0, 0);
        LocalDateTime ldt2 =  LocalDateTime.of(2025, Month.MAY, 1, 0, 0, 0);
        Period period = Period.ofWeeks(1);
        Duration duration = Duration.ofHours(24);
        shoppingMall.shift(ldt1, ldt2, period, duration);
    }
}
