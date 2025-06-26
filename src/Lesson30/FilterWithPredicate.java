package Lesson30;
import java.util.function.*;
import java.util.ArrayList;

public class FilterWithPredicate {
}

class Animal {
    String name;
    String habitat;
    int age;
    String species;

    Animal(String name, String habitat, int age, String species) {
        this.name = name;
        this.habitat = habitat;
        this.age = age;
        this.species = species;
    }
}

class AnimalInfo {
    void showAnimalInfo(Animal animal) {
        System.out.println("Name: " + animal.name + ", habitat: " + animal.habitat + ", age: " + animal.age + ", species: " + animal.species);
    }

    void filterAnimals(ArrayList<Animal> animals, Predicate<Animal> t) {
        for (Animal animal : animals) {
            if (t.test(animal)) {
                showAnimalInfo(animal);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal cow = new Animal("Cow", "Grasslands", 10, "Bos taurus");
        Animal dolphin = new Animal("Dolphin", "Ocean", 8, "Delphinidae");
        Animal fox = new Animal("Fox", "Forest", 4, "Vulpes vulpes");
        Animal elephant = new Animal("Elephant", "Savanna", 25, "Loxodonta");
        Animal parrot = new Animal("Parrot", "Rainforest", 2, "Psittaciformes");

        animals.add(cow);
        animals.add(dolphin);
        animals.add(fox);
        animals.add(elephant);
        animals.add(parrot);

        AnimalInfo info = new AnimalInfo();

        info.filterAnimals(animals, a -> a.age > 5);
        System.out.println("-----------------------------------------------------------------");
        info.filterAnimals(animals, a -> a.name.equals("Cow"));
        System.out.println("-----------------------------------------------------------------");

        // removeIf()
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
        System.out.println("-----------------------------------------------------------------");
        animals.removeIf(animal -> animal.name.contains("in"));
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }

}
