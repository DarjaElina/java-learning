package Lesson21;

public class Review3 {
    Review3() {
        System.out.println("This is constructor");
        System.out.println("Object created 🎉");
    }
    void Review3() {
        System.out.println("This is method"); // ❗️ constructor cannot have a return type
    }

    public static void showParam(int param) {
        System.out.println("Param: " + param);
    }
}

class A {
    public static void main(String[] args) {
        Review3 r = new Review3();

        char a = 'a';
        Review3.showParam(a); // "Param: " + 97
    }
}
