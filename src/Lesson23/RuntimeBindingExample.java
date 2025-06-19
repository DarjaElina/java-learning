package Lesson23;

public class RuntimeBindingExample {
    public static void main(String[] args) {
        Human juha = new Finn("Juha");
        // example of runtime binding 👇
        juha.greetAndIntroduce(); // prints Moi! 🇫🇮 My name is Juha
    }
}

class Human {
    String name;

    String greet() {
        return "Hello!";
    }

    void greetAndIntroduce() {
        System.out.println(greet() + " My name is " + name);
    }
}

class Finn extends Human {

    Finn(String name) {
        this.name = name;
    }
    String greet() {
        return "Moi! 🇫🇮";
    }
}