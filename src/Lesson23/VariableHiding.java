package Lesson23;

public class VariableHiding {
    public static void main(String[] args) {
        Musician musician = new Musician(); // case 1
        Musician violinist = new Violinist(); // case 2
        Violinist violinist2 = new Violinist(); // case 3

        System.out.println(musician.salary); // 1000
        System.out.println(violinist.salary); // 1000
        System.out.println(violinist2.salary); // ❗️ only here "One thousand dollars"
        // because Java uses compile time binding and reference type
        // case 1: A reference type is Musician, object created at runtime is Musician
        // case 2: A reference type is Musician, object created at runtime is Violinist
        // case 3: A reference type is Violinist, object created at runtime is Violinist
    }
}

class Musician {
    // variable hiding
    int salary = 1000;
}

class Violinist extends Musician {
    // variable hiding
    String salary = "One thousand dollars";
}
