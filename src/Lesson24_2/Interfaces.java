package Lesson24_2;

public class Interfaces {
}

interface Singable {
    private static void sing() {
        System.out.println("Singing");
    }

    // private interface methods should have body
    private void singOpera() {
        System.out.println("Singing Opera");
    };

    default void singJazz() {
        sing();
    }

    static void singCountry() {
        sing();
    }
}
