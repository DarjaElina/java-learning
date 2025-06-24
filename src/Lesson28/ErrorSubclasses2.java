package Lesson28;

public class ErrorSubclasses2 {
    void method() {
        System.out.println("Method");
        throw new StackOverflowError();
    }

    void method2() {
        try {
            method();
            return;
        } finally {
            System.out.println("Finally block");
        }
    }
    public static void main(String[] args) {
        ErrorSubclasses2 eS = new ErrorSubclasses2();
        eS.method2();
    }
}
