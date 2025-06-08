package Homework.Lesson14;

public class Time {
    public static void showTime() {
        OUTER: for (int hour = 0; hour <= 6; hour++) {
            MIDDLE: for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                INNER: for (int second = 0; second <= 59; second++) {
                    if ((second * hour) > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }
}
