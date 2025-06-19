package Homework.Lesson23.Test3;

public class X {
    public X() {
        System.out.println("X");
    }
    public X(int i) {
        System.out.println("X" + i);
    }
    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        X x = new Y(18);
        System.out.println(x.abc()); // ❗️ private methods cannot be overridden, it will call abc() from X, not from Y
    }
}

class Y extends X {
    public Y(int i) {
        System.out.println("Y");
    }

    public boolean abc() {
        return true;
    }
}
