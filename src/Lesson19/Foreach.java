package Lesson19;

public class Foreach {
    public static void main(String[] args) {
        int[] array = {0, 8, 4, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // enhanced for
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        // find sum with enhanced for
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        System.out.println(sum);

        // nested enhanced for
        String[] students = {"Jane", "John", "Anna"};
        String[] exams = {"Math", "Philosophy"};

        for (String student : students) {
            for (String exam : exams) {
                System.out.println(student + ": " + exam + " ");
            }
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            number = 3;
        }
        for (int number : numbers) {
            System.out.print(number + " "); // prints 1 2 3 4 5 🤔
        }
        // with foreach, we cannot change the values of primitive data types inside an array

        // as well as we cannot change the reference, make item reference to a new object
        String[] greetings = {"Hello", "Buon Giorno", "Privet", "Moi"};
        for (String greeting : greetings) {
            greeting = new String("Heippa");
        }

        // But we can change the value of object using methods
        System.out.println();
        StringBuilder cat = new StringBuilder("Cat");
        StringBuilder dog = new StringBuilder("Dog");
        StringBuilder fox = new StringBuilder("Fox");

        StringBuilder[] animals = {cat, dog, fox};
        for (StringBuilder animal : animals) {
            animal.append(" is cute!");
        }
        for (StringBuilder animal : animals) {
            System.out.println(animal);
        }
    }
}
