package Homework;

// Lesson 2 Homework: Practice creating variables using different Java primitive data types.

public class Lesson2 {
    public static void main(String[] args) {
        byte byte_decimal = 12;
        byte byte_binary = 0B1100;
        byte byte_octal = 014;
        byte byte_hex = 0xC;

        System.out.println("byte_decimal = " + byte_decimal);
        System.out.println("byte_binary = " + byte_binary);
        System.out.println("byte_octal = " + byte_octal);
        System.out.print("byte_hex = " + byte_hex);

        short short_decimal = 1300;
        short short_binary = 0B10100010100;
        short short_octal = 02424;
        short short_hex = 0x514;

        System.out.println("short_decimal = " + short_decimal);
        System.out.println("short_binary = " + short_binary);
        System.out.println("short_octal = " + short_octal);
        System.out.print("short_hex = " + short_hex);

        int int_decimal = 0;
        int int_binary = 0B0;
        int int_octal = 00;
        int int_hex = 0x0;

        System.out.println("int_decimal = " + int_decimal);
        System.out.println("int_binary = " + int_binary);
        System.out.println("int_octal = " + int_octal);
        System.out.print("int_hex = " + int_hex);

        long long_decimal = 123456789L;
        long long_binary = 0B111010110111100110100010101L;
        long long_octal = 0726746425L;
        long long_hex = 0x75BCD15L;

        System.out.println("long_decimal = " + long_decimal);
        System.out.println("long_binary = " + long_binary);
        System.out.println("long_octal = " + long_octal);
        System.out.print("long_hex = " + long_hex);

        float float1 = 3.14f;
        float float2 = 42.0F;

        System.out.println("float1 = " + float1);
        System.out.println("float2 = " + float2);

        double double1 = 3.14;
        double double2 = 42.0;

        System.out.println("double1 = " + double1);
        System.out.println("double2 = " + double2);

        boolean boolean1 = true;
        boolean boolean2 = false;

        System.out.println("boolean1 = " + boolean1);
        System.out.println("boolean2 = " + boolean2);

        char char1 = '&';
        char char2 = 38;
        char char3 = '\u0026';

        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);

    }
}
