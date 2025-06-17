package Lesson16_2;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.isBlank()); // false

        String s2 = "     ";
        System.out.println(s2.isBlank()); // true

        String s3 = "    g ";
        System.out.println(s3.isBlank()); // false

        String s4 = " ";
        System.out.println(s4.isEmpty()); // false

        String s5 = "";
        System.out.println(s5.isEmpty()); // true

        String s6 = "       Hello   ";
        System.out.println(s6.strip());
        System.out.println(s6.stripLeading());
        System.out.println(s6.stripTrailing());

        String s7 = "Goodbye";
        String s8 = s7.strip();
        System.out.println(s7 == s8);
    }
}
