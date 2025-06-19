package Lesson23;

public class CompileTimeBindingExample {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        chocolate.showInfoAboutCandy(); // Candy: Generic Candy
        chocolate.showInfoAboutChocolate(); // Chocolate: Chocolate 🍫
        // here happens compile time binding, because showName() methods are static. ❗️
    }
}

class Candy {
    String name;

    static String showName() {
        return "Generic Candy";
    }

    void showInfoAboutCandy() {
        System.out.println("Candy: " + showName());
    }
}

class Chocolate extends Candy {
    static String showName() {
        return "Chocolate 🍫 ";
    }

    void showInfoAboutChocolate() {
        System.out.println("Chocolate: " + showName());
    }
}
