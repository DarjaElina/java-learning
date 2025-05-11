package Lesson5;

public class Methods {
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int average(int a, int b, int c) {
        return sum(a, b, c) / 3;
    }
}

class MethodsTest {
    public static void main(String[] args) {
        Methods m = new Methods();
        System.out.println(m.sum(1, 2, 3));

        System.out.println(m.average(1, 2, 3));
    }
}
