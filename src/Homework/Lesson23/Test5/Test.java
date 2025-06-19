package Homework.Lesson23.Test5;

class X {
    String s1 = "Hello";
}
class Y extends X {
    boolean bool = false;
}
public class Test {
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.s1 + x.bool); // ❌ error
        // compile time binding
        // compiler will look for bool inside X
        // and there is no such variable
    }
}
