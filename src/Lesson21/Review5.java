package Lesson21;

public class Review5 {
    public void showGreeting(int a, double b) {
       System.out.println("Buona sera! 🌠");
    }
    public void showGreeting(double a, int b) {
        System.out.println("Buon giorno! 🌞");
    }

    public static void main(String[] args) {
        Review5 review5 = new Review5();
        review5.showGreeting(5, 1.5);
        review5.showGreeting(5.2, 2);
    }
}
