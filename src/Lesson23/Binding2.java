package Lesson23;

public class Binding2 {
    void printPet(Pet p) {
        System.out.println("Pet 🐾");
    }
    void printPet(Toad t) {
        System.out.println("Toad 🐸");
    }

    public static void main(String[] args) {
        Binding2 b = new Binding2();
        Pet pet = new Toad();
        b.printPet(pet); // which method will be called? 🤔

        // here 👆 pet is a variable
        // we are using this variable as a parameter: b.printPet(pet);
        // Compiler knows that we call printPet that accepts Pet as a parameter, not Toad
        // printPet(Pet p) will be called
        // we don't even need a run time binding here!

        // this is the example of run time binding. 👇
        pet.greet(); // what will be printed? 🤔
        // Java will only know at run time, when an actual object is created
        // will print "I am Toad 🐸"
    }
}

class Pet {
    void greet() {
        System.out.println("I am Pet 🐾");
    }
}

class Toad extends Pet {
    void greet() {
        System.out.println("I am Toad 🐸");
    }
}