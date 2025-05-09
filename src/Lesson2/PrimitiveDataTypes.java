package Lesson2;

class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Java variables: Type, Name, Size, Value

        // Primitive data types: 8 total
        // - Integers: byte, short, int, long
        // - Floating-point: float, double
        // - Character: char
        // - Boolean: boolean

        // --- Integer types ---
        byte byte1 = 10;
        byte byte2 = 20;

        short short1 = 5;
        short short2 = -10;
        short short3 = 0;

        int integer1 = 500;

        long long1 = 1000;
        long long2 = 10000000000L;

        // --- Floating-point types ---
        float float1 = 3.14F;
        float float2 = 20;

        double double1 = 3.14;

        // --- Character types ---
        char char1 = 'a';
        char char2 = 'A';

        char char3 = 300;
        System.out.println(char3); // Ĭ

        char char4 = '\u1234'; // ሴ
        System.out.println(char4);

        char char5 = '\u0500'; // Ԁ
        char char6 = 500;      // Ǵ

        System.out.println("char5 is " + char5);
        System.out.println("char6 is " + char6);

        System.out.println('\u0300'); // invisible combining accent
        System.out.println("a\u0300"); // à (a + combining accent)

        // --- Boolean types ---
        boolean boolean1 = true;
        boolean boolean2 = false;

        // --- Number systems ---
        int a1 = 60;         // decimal
        int a2 = 0B111100;   // binary
        int a3 = 074;        // octal
        int a4 = 0x3C;       // hex

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        // --- Underscore readability (Java 7+) ---
        int a7 = 1000000;
        int a8 = 1_000_000;

        // Underscore rules:
        // ❌ Can't be at start/end of number
        // ❌ Can't be around decimal points or suffixes (L, F, etc.)
        // ❌ Can't be in base prefixes (0x, 0b)
    }
}
