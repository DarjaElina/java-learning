package Lesson28;
import java.util.*;

public class Exceptions9 {
    public static void createPassword(String password) {
        if (password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters");
        }
        if (password.length() > 50) {
            throw new IllegalArgumentException("Password must be at most 50 characters");
        }
        System.out.println("Password accepted");
    }
    public static void main(String[] args) {
        Exception e = null;
        // throw e; we cannot do this without using throws in method signature
        // and outside of try/catch

        // IndexOutOfBoundsException
        ArrayList<String> list = new ArrayList<>();
        list.add("Kissa 🇫🇮🐈");
        list.add("Cat 🏴󠁧󠁢󠁥󠁮󠁧󠁿🐈");
        list.add("Koshka 🇷🇺🐈");
        list.add("Gatto 🇮🇹🐈");
        // System.out.println(list.get(4)); ❌ Index 4 out of bounds for length 4

        // ArithmeticException
        // System.out.println(6 / 0); ❌ java.lang.ArithmeticException

        // ClassCastException
        Panter panter = new Panter();
        PersianCat persianCat = new PersianCat();
        Cat[] cats = {panter, persianCat};
        // PersianCat persianCat2 = (PersianCat) cats[0]; ❌ java.lang.ClassCastException

        // IllegalArgumentsException
        createPassword("password");
        // createPassword("pass"); ❌ java.lang.IllegalArgumentException: Password must be at least 6 characters

        // NumberFormatException
        // Integer.parseInt("42 cats"); ❌ java.lang.NumberFormatException: For input string: "42 cats"
    }
}

class Cat {}
class Panter extends Cat {}
class PersianCat extends Cat {}

// IllegalStateException
class Airplane {
    String state = "waiting"; // 3 states: waiting, in the air, canceled
    public void fly() {
        state = "In the air";
        System.out.println("Plane is flying");
    }

    public void waitForFlight() {
        if (state.equals("In the air")) {
            throw new IllegalStateException("Plane is already flying");
        }
        state = "Waiting";
        System.out.println("Awaiting flight...");
    }

    public void cancelFlight() {
        if (state.equals("In the air")) {
            throw new IllegalStateException("Plane is already flying");
        }
        state = "Flight cancelled";
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.waitForFlight();
        airplane.fly();
        airplane.cancelFlight(); // ❌ java.lang.IllegalStateException: Plane is already flying
    }
}
