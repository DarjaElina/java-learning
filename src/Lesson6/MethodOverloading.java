package Lesson6;

public class MethodOverloading {
    // with same return type
    void show(int i) {
        System.out.println(i);
    }

    // we cannot define any more methods with same number and types of parameters
    //    void show(int i) {
    //        System.out.println(i);
    //    }

    void show(boolean b) {
        System.out.println(b);
    }

    void show(String s) {
        System.out.println(s);
    }

    void show(String s, int i) {
        System.out.println("String: " + s + ", Int: " + i);
    }

    // with different return types
    int sum(int x, int y) {
        return x + y;
    }

    String sum(String x, String y) {
        return x + y;
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        int a = 500;
        m.show(a);

        boolean b = true;
        m.show(b);

        String s = "Hello";
        m.show(s);

        int x = 10;
        int y = 20;

        String s1 = "Hello, ";
        String s2 = "World";

        int sumInt = m.sum(x, y);
        String sumStr = m.sum(s1, s2);
        System.out.println(sumInt);
        System.out.println(sumStr);
    }
}
