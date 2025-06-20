package Lesson24;

public class StaticMethods {
}

interface Language {
    static void getName() {
        System.out.println("Language");
    }
}
class JavaLanguage implements Language {
    public static void main(String[] args) {
        // we cannot call Language's static method here
        // getName(); ❌ Static method may only be called on its containing interface
        // JavaLanguage.getName(); ❌ Static method may only be called on its containing interface

        // classes do not inherit static methods from interfaces

        // we can only call them using the interface itself
        Language.getName();
    }
}