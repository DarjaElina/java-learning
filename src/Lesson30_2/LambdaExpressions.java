package Lesson30_2;

public class LambdaExpressions {
    public static void main(String[] args) {}
}

// this is an example of a functional interface.
interface Bird {
    void sing();
}

// this is also an example of a functional interface
interface Animal {
    // it can have only one abstract method ❗️
    void eat();

    // but it can also have other default methods
    default void breathe() {}
    default void walk() {}
}