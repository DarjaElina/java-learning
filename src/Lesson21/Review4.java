package Lesson21;

public class Review4 {
    int returnFive() {
        return 5;
    }

    int returnFiveOrTen(int a) {
        if (a > 10) {
            return 5;
        } else {
            return 10;
        }
    }

    void printGreeting() {
        System.out.println("Hello! 👋");
    }

    public static void main(String[] args) {
        int five = new Review4().returnFive();
        new Review4().returnFive(); // we don't need to assign a returned value to a variable
    }
}
