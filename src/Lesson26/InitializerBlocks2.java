package Lesson26;

public class InitializerBlocks2 {
    String cat = "Mirri"; // #1

    InitializerBlocks2() {
        cat = "Barsik"; // #3
    }

    {
        cat = "Luna"; // #2
    }

    public static void main(String[] args) {
        InitializerBlocks2 iB = new InitializerBlocks2();
        System.out.println(iB.cat); // Barsik 🐈
    }
}

class Sky {
    static final String moon;
    String color = "dark blue 💙";

    static {
        moon = "🌚"; // we can assign values to static final variables inside static init. blocks

        // we cannot assign values to non-static variables here
        // color = "light blue 🩵"; ❌ compiler error

        // static initializer run when class is loaded to memory, not when an object is created
        // and at that point "color" does not exist yet
    }
}

class Flower {
    static int petals;
    static final String color;
    static final String name = "Flower";
    static final boolean hasScent;

    static {
        petals = 10;
        color = "blue";
        // name = "Forget-me-not"; // we cannot do this, name is a constant
        hasScent = false;
    }
}

class IAmSoOutOfFantasyForClassNames {
    String cat = "Simba 🦁";
    {
        System.out.println(cat);
    }
    static boolean isKing = false;
    static {
        System.out.println("Simba is our King: " + isKing); // #1
    }
    static {
        isKing = true;
        System.out.println("Simba is our King: " + isKing); // #2
    }

    IAmSoOutOfFantasyForClassNames() {
        System.out.println("This is the Simba Constructor 🦁");
    }

    public static void main(String[] args) {
        IAmSoOutOfFantasyForClassNames obj = new IAmSoOutOfFantasyForClassNames();
        // what will it print?
    }
}

class FrogIntroducer {
    static {
        introduceFrog("Janette 🐸"); // #1
    }

    static void introduceFrog(String frog) {
        System.out.println("Meet the frog: " + frog);
    }

    FrogIntroducer() {
        introduceFrog("Lucy 🐸"); // 6
    }

    static {
        introduceFrog("Esther 🐸"); // #2
    }

    {
        introduceFrog("Madeleine 🐸"); // #4
    }

    static {
        new FrogIntroducer(); // #3
    }

    {
        introduceFrog("Bella 🐸"); // #5
    }

    public static void main(String[] args) {
        // 1st static init. block runs
        // Janette 🐸
        // 2nd static init. block runs
        // Esther 🐸
        // 3rd static init. block runs
        // inside its body we create a new instance = call a constructor
        // when we call a constructor, what happens?
        // non-static init. block run
        // Madeleine 🐸
        // Bella 🐸
        // only then constructor run
        // Lucy 🐸
    }
}