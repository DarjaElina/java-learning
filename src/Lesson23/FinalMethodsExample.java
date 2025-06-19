package Lesson23;

public class FinalMethodsExample {
}

class Insect {
    String name;

    // this method cannot be overridden, because it is final
    final void eat() {
        System.out.println("Insect eats");
    }

    final static void sleep() {
        System.out.println("Insect sleeps");
    }
}

class Bee extends Insect {
    void zzz() {
        System.out.println("zzz 🐝");
    }

    // we try to override eat()
//    void eat() {
//        System.out.println("Bee eats");
//    }
    // ❌ but get compiler error: 'eat()' cannot override 'eat()' in 'Lesson23.Insect'; overridden method is final


    // we try to hide sleep()
    // ❌ again compiler error
//    static void sleep() {
//        System.out.println("Bee sleeps");
//    }
}

// final classes cannot be inherited
final class A {}
// class B extends A {}

// Why use final classes?
// 1) If we need better performance -> all methods we call from class A will now have only compile time binding
// 2) If we don't want a class to have children and override something

// Some of Java built in classes, for example, String, have final modifier
// class C extends String {} // ❌ Cannot inherit from final class 'java.lang.String'