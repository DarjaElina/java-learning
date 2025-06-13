package Homework.Lesson17;

public class Main {
    public static boolean equals(StringBuilder a, StringBuilder b) {
        return a.toString().equals(b.toString());
    }

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hello");
        StringBuilder b = new StringBuilder("World");
        StringBuilder c = new StringBuilder("Hello");
        System.out.println(equals(a, b));
        System.out.println(equals(a, c));
    }
}
