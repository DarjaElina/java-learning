package Lesson25;

import Homework.Lesson9.Cat;
import Lesson7.A;

public class Polymorphism4 {
  public static void main(String[] args) {
      Animal animal = new Animal();
      Animal dog = new Dog("Chihuahua");
      Animal duck = new Duck();
      Animal tiger = new Tiger();
      Animal[] animals = {animal, dog, duck, tiger};

      for (Animal a : animals) {
          if (a instanceof Tiger) {
             // a.roar(); // ❌ won't compile
              ((Tiger) a).roar(); // ✅ Correct way
          }
      }
  }
}

class UpcastingExample {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World"};
        Object[] objects = strings; // upcasting happens automatically

        String[] strings2 = (String[])objects; // downcasting, we need to cast manually
    }
}

class Greeter {
  String lang = "English";
  void greet() {
      System.out.println("Hello");
  }
}

class ItalianGreeter extends Greeter {
    String lang = "Italian";
    void greet() {
        System.out.println("Buona sera 🇮🇹");
    }
}

class FinnishGreeter extends ItalianGreeter {
    String lang = "Finnish";
    void greet() {
        System.out.println("Moikka 🇫🇮");
    }

    public static void main(String[] args) {
        FinnishGreeter finnishGreeter = new FinnishGreeter();
        finnishGreeter.greet(); // Moikka 🇫🇮

        System.out.println(((Greeter)finnishGreeter).lang); // English
        ((Greeter)finnishGreeter).greet(); // Moikka 🇫🇮
        // here 👆 we decide at runtime!
        // and at runtime Java sees that our finnishGreeter is FinnishGreeter
        // even though we did a type cast
    }
}

