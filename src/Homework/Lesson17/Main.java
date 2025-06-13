package Homework.Lesson17;

public class Main {
    public static boolean equals(StringBuilder a, StringBuilder b) {
        return a.toString().equals(b.toString());
    }

    public static boolean equals2(StringBuilder a, StringBuilder b) {
        boolean result = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hello");
        StringBuilder b = new StringBuilder("World");
        StringBuilder c = new StringBuilder("Hello");
        System.out.println(equals(a, b));
        System.out.println(equals(a, c));

        System.out.println(equals2(a, b));
        System.out.println(equals2(a, c));
    }
}
