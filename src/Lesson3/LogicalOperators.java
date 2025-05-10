package Lesson3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2 && b3); // false;
        System.out.println(b1 || b2 || b3); // true

        // Short Circuit Operators

        // If the evaluation of a logical expression exits in between before complete evaluation, then it is known as Short-circuit
        // A short circuit happens because the result is clear even before the complete evaluation of the expression

        System.out.println(b1 || b2 || b3); // b1 is true, then we exit early, this expression is truthy
        boolean b4 = false;
        System.out.println(b4 && b2 && b3); // b4 is false, then we exit early, this expression is falsy

        boolean b5 = true;
        System.out.println(!b5); // false

        // Bitwise & and |

        int num = 99;

        boolean b6 = 10 < 50 || ++num == 100; // if we use || operator, there will be a short circuit
        // but what if we would need to execute this until the end and not exit early? for example, increment the num variable?
        // then we would be bitwise | operator
        boolean b7 = 10 < 50 | ++num == 100;
        System.out.println("num is " + num); // will be 100 ❗️ because we did not increment it on line 28, but we did on line 31!

        // Bitwise operators can work with numbers

        int num1 = 10;
        int num2 = 5;

        // this would be an error:
        // System.out.println(num1 && num2);
        // System.out.println(num1 || num2);

        System.out.println(num1 & num2); // 0
        System.out.println(num1 | num2); // 15 🤯

        // the logic
        // 10 in binary is 1010
        // 5 in binary is 101

        // using &

        // 1010
        // 0101
        // OR
        // true false true false
        // false true false true
        // if we use && with each bit
        // will be false false false false => 0000 => 0

        // using |
        // 1010
        // 0101
        // if we use || with each bit
        // we will get true true true true or 1111 => in decimal 1111 is 15

        // Bitwise exclusive OR
        // true ^ true ^ true => false
        // true ^ true ^ false => false
        // false ^ false ^ false => false
        // true ^ false ^ false => true, only in this case it will return true
    }
}
