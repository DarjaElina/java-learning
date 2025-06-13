package Lesson17;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45"); // because here we did not create a new StringBuilder. sb2 has a reference to sb1
        sb2 = sb2.append("6").append("7");
        System.out.println("sb1 is: " + sb1); // ❗️1234567
        System.out.println("sb2 is: " + sb2); // ❗️1234567

        StringBuilder greeting1 = new StringBuilder("Hello");
        StringBuilder greeting2 = new StringBuilder("Hello");
        StringBuilder greeting3 = greeting2;
        System.out.println(greeting1.equals(greeting2)); // false, equals() works differently for StringBuilders
        System.out.println(greeting2.equals(greeting3)); // true, because they store references to the same object


        StringBuilder sb3 = new StringBuilder("Hello");
        String s1 = new String(sb3);
        StringBuffer sb4 = new StringBuffer("Goodbye");
        String s2 = new String(sb4);
        System.out.println(s1);
        System.out.println(s2);
    }
}
