package Lesson26;

public class InitBlocks3 {
    public static void main(String[] args) {
        Lion l = new Lion();
    }

}

class Animal {
    Animal() {
        System.out.println("Animal constructor"); // #5
    }

    static {
        System.out.println("Animal static block"); // #1
    }

    {
        System.out.println("Animal non-static block"); // #4
    }
}

class Mammal extends Animal {
    Mammal() {
        System.out.println("Mammal constructor"); // #7
    }

    static {
        System.out.println("Mammal static block"); // #2
    }

    {
        System.out.println("Mammal non-static block"); // #6
    }
}

class Lion extends Mammal {
    Lion() {
        System.out.println("Lion constructor"); // #9
    }

    static {
        System.out.println("Lion static block"); // #3
    }

    {
        System.out.println("Lion non-static block"); // #8
    }
}

