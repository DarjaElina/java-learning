package Lesson17;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // capacity is 16
        StringBuilder sb2 = new StringBuilder("Good Day!");
        StringBuilder sb3 = new StringBuilder(50); // capacity will be 50 characters
        StringBuilder sb4 = new StringBuilder(sb3);
        // by default capacity is 16
    }
}
