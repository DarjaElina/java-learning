package Lesson31;

public class TypeErasureTroubles {
    // type erasure troubles with method overloading

    public static void getStuffFromStarry(StarryDecorator<String> decorator) {
        String s = decorator.getValue();
    }
    // ✅ all good at this point

//    public void getStuffFromStarry(StarryDecorator<Integer> decorator) {
//        Integer i = decorator.getValue();
//    }
    // ❌ not good any more
    // compiler error: both methods have the same erasure

    // the problem is that
    // after type erasure, these 2 methods will look exactly the same
}

class StarryDecorator<T> {
    private T value;
    public StarryDecorator(T value) {
        this.value = value;
    }
    public String toString() {
        return "⭐️ 🌌 💫 🌠 " + value;
    }

    public T getValue() {
        return value;
    }
}

// troubles with method overriding
class Parent {
    public static void getStuffFromStarry(StarryDecorator<String> decorator) {
        String s = decorator.getValue();
    }
}

class Child extends Parent {

    // this 👇 causes compiler error
//    public static void getStuffFromStarry(StarryDecorator<Integer> decorator) {
//        Integer i = decorator.getValue();
//    }
    // both methods have the same erasure, yet neither hides the other
}