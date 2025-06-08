package Lesson16;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Hello");

        //length()
        // find string length
        int a;
        a = s1.length();
        System.out.println(a);

        // charAt()
        // return char at specific index
        char c = s1.charAt(3);
        System.out.println(c);

        // indexOf();
        // return index of char or substring within string
        int i = s1.indexOf('o');
        System.out.println(i);

        int i2 = s1.indexOf("llo");
        System.out.println(i2);

        int i3 = s1.indexOf("R"); // will print -1
        System.out.println(i3);

        String s2 = new String("abcdefgabcd");
        int i4 = s2.indexOf("a");
        System.out.println(i4); // will print 0, but what if we want the next a?
        int i5 = s2.indexOf("a", 5); // searching from index 5
        System.out.println(i5); // will print 7


        // startsWith()
        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);

        boolean b2 = s2.startsWith("abc", 7);
        System.out.println(b2);

        // endsWith()
        boolean b3 = s1.endsWith("abc");
        System.out.println(b3);

        // substring()
        String s3 = s1.substring(3);
        System.out.println(s3);

        String s4 = s1.substring(0, 4);
        System.out.println(s4);

        // trim()
        String s12 = new String("   Hel lo    ");
        System.out.println(s12.trim());

        // replace()

        String greeting = "Hello World";
        String greeting2 = greeting.replace("World", "Java");
        System.out.println(greeting2);

        String s13 = "Cat";
        String s14 = s13.replace('C','C');
        System.out.println(s13 == s14); // true 🤯

        // concat()
        String s15 = "Hello, ";
        String s16 = s15.concat("Friend");
        System.out.println(s16);

        // loLowerCase()
        System.out.println("HELLO".toLowerCase());

        // loUpperCase()
        System.out.println("hello".toUpperCase());

        // contains()

        boolean b = s1.contains("Hello");
        System.out.println(b);
    }
}
