package Lesson29;
import java.time.*;

public class DateTimeIntro {
    public static void main(String[] args) {
        // now()

        System.out.println(LocalDate.now()); // 2025-06-25
        System.out.println(LocalDateTime.now()); // 2025-06-25T13:16:57.911981
        System.out.println(LocalTime.now()); // 13:16:57.912046

        // creating instances
        // LocalDate ld = new LocalDate(2010, 5, 15); // we cannot do this,
        // because LocalDate has private constructor
        // this means that we cannot create intances of LD, LDT and LT using constructors,
        // but we can do it using methods

        // LocalDate of()

        LocalDate ld = LocalDate.of(2014, 5, 15);
        System.out.println(ld); // 2014-05-15

        LocalDate ld2 = LocalDate.of(2020, Month.AUGUST, 3);
        System.out.println(ld2); // 2020-08-03
        // Month is Java is an enum

        // LocalTime of()
        LocalTime lt = LocalTime.of(15, 30);
        System.out.println(lt); // 15:30

        LocalTime lt2 = LocalTime.of(15, 30, 45);
        System.out.println(lt2); // 15:30:45

        LocalTime lt3 = LocalTime.of(15, 30, 45, 60);
        System.out.println(lt3); // 15:30:45.000000060

        // LocalDateTime of()
        LocalDateTime ldt = LocalDateTime.of(2013, 9, 10, 17, 30);
        System.out.println(ldt); // 2013-09-10T17:30

        LocalDateTime ldt2 = LocalDateTime.of(2013, 9, 10, 17, 30, 45);
        System.out.println(ldt2); // 2013-09-10T17:30:45

        LocalDateTime ldt3 = LocalDateTime.of(2013, 9, 10, 17, 30, 45, 60);
        System.out.println(ldt3); // 2013-09-10T17:30:45.000000060

        LocalDateTime ldt4 = LocalDateTime.of(ld, lt);
        System.out.println(ldt4); // 2014-05-15T15:30
    }
}

// example of creating instances using method instead of constructor 👇

class Car {
    private Car() {}

    static Car createCar() {
        return new Car();
    }

    // inside other classes we can now do
    // Car c = Car.createCar();
}
