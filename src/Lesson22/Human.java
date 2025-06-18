package Lesson22;

public class Human {
    final String gender;
    Human(String gender) {
        this.gender = gender;
    }
    String name;
    int age;
    int weight;

    // implementation using encapsulation 👇
    private String encapsulatedName;
    private int encapsulatedAge;
    private int encapsulatedWeight;
    private StringBuilder surname;

    // if we want to modify or access private variables outside the class, we need public methods. 👇

    // getters, allows seeing private variables
    public String getEncapsulatedName() {
        return encapsulatedName;
    }
    public int getEncapsulatedAge() {
        return encapsulatedAge;
    }
    public int getEncapsulatedWeight() {
        return encapsulatedWeight;
    }
    // ❌ bad practice 👇
    public StringBuilder getSurnameUnsafe() {
        return surname;
    }

    // ✅ good 👇
    public StringBuilder getSurnameSafe() {
        StringBuilder copy = new StringBuilder(surname);
        return copy;
    }


    // setters, allows changing private variables
    public void setEncapsulatedName(String name) {
        this.encapsulatedName = name;
    }
    public void setEncapsulatedAge(int age) {
        if (age > 0 && age < 150) {
            this.encapsulatedAge = age;
        }
    }
    public void setEncapsulatedWeight(int weight) {
        if (weight > 0) {
            this.encapsulatedWeight = weight;
        }
    }
    public void setSurname(StringBuilder surname) {
        this.surname = surname;
    }

}

class Main {
    public static void main(String[] args) {
        Human men = new Human("male");
        men.name = "John";
        // right now we can do things like:
        men.age = 2500;
        men.weight = -65;
        // which is not good, that is why we are going to use encapsulation

        // now we cannot do:
        // human.encapsulatedAge = 2500; ❌ 'encapsulatedAge' has private access

        Human woman = new Human("female");
        woman.setEncapsulatedName("Jane");
        woman.setEncapsulatedAge(45);
        woman.setEncapsulatedWeight(50);
        System.out.println(woman.getEncapsulatedName()); // Jane
        System.out.println(woman.getEncapsulatedAge()); // 45
        System.out.println(woman.getEncapsulatedWeight()); // 50

        woman.setEncapsulatedWeight(-100);
        System.out.println(woman.getEncapsulatedWeight()); // still prints 50 ✅
        woman.setSurname(new StringBuilder("Doe"));
        // now we can use getter to change surname, which is a bad practice ❌
        // with get we should be able to only view (get) the property, but not modify it like this. 👇
        woman.getSurnameUnsafe().append("-Smith");
        System.out.println(woman.getSurnameUnsafe()); // ❌ Doe-Smith

        // ✅ now we are not able to modify the property with getter
        woman.setSurname(new StringBuilder("Smith"));
        woman.getSurnameSafe().append("-Smith");
        System.out.println(woman.getSurnameSafe()); // ✅ still Smith


    }
}