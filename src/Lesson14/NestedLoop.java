package Lesson14;

public class NestedLoop {
    public void time() {
        OUTER: for (int hour = 0; hour <= 23; hour++) {
            INNER: for (int minute = 0; minute <= 59; minute++) {
            if (minute == 20) {
                continue OUTER;
            }
                System.out.println(hour + ":" + minute);
               // if (minute == 30) break OUTER;
            }

        }
    }

    public static void main(String[] args) {
        NestedLoop nestedLoop = new NestedLoop();
        nestedLoop.time();
    }
}
