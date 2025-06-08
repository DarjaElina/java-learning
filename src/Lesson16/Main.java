package Lesson16;

public class Main {
    final static Car c = new Car("red", "V8");
    public static void main(String[] args) {
        // c = new Car("green", "V12"); // Cannot assign a value to final variable 'c'
        c.color = "black";

        String s = null;
        s+=" ok";
        System.out.println(s);
    }
}
