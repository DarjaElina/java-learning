package Lesson15;

public class Time {
    public static void main(String[] args) {
        int hour = -1;
        OUTER: do {
            hour++;
            int minute = 0;
            INNER: while (minute < 60) {
                if (minute == 20) {
                    continue OUTER;
                }
                System.out.println(hour + ":" + minute);
                minute++;
            }

        } while (hour < 24);


        for (int hour1 = 0; hour1 < 24; hour1++) {
            int minute1 = 0;
            while (minute1 < 60) {
                System.out.println(hour1 + ":" + minute1);
                minute1++;
            }
        }
    }
}
