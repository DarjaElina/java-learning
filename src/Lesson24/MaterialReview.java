package Lesson24;

public class MaterialReview {}

class A {
    String s = "Hello";
    void abc() {
        System.out.println("🙋‍♀️");
    }
}

class B extends A {
    String s = "Goodbye";
    void abc() {
        System.out.println("👋");
    }
}

class C extends B {
    public static void main(String[] args) {
        C c = new C();
        // inherits overridden methods from class B 👇
        c.abc(); // 👋
        System.out.println(c.s); // Goodbye
    }
}
