package Lesson3;

public class AssignmentOperators {
    public static void main(String[] args) {
        // Assignment operators

        // =

        int num1 = 3;

        // +=, -=, *=, /=

        int num2 = 20;
        System.out.println(num2 += 5); // num2 = num2 + 5 = 25
        System.out.println(num2 -= 5); // num2 = num2 - 5 = 20
        System.out.println(num2 *= 5); // num2 = num2 * 5 = 100
        System.out.println(num2 /= 5); // num2 = num2 / 5 = 20

        int num3 = 3;
        int num4 = 50;
        int num5 = 0;

        num3 = num4 = num5 = 18;

        System.out.println(num3); // 18
        System.out.println(num4); // 18
        System.out.println(num5); // 18

        long numLong = 100L;

        // compiler error: cannot assign type long to type int (long is bigger that int, it may not fit into int)
        // int numInt = numLong;

        // BUT we can do the opposite: assign larger data types to smaller ones, this is safe, int will fint into long
        int numByte = 10;
        long numShort = numByte;

        // we can assign any whole number to the float or double
        long numLong2 = 1000000000L;
        float numFloat = numLong2;
    }

}
