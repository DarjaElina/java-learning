package Lesson26;

public class InitializerBlocks {
    String someCuteAnimalEmojiBecauseIAmTiredOfJavaTheory;
    // if we want some code to always run when an object is created
    // no matter what constructor is called,
    // we can use initializer blocks

    {
        System.out.println("Initializer block is running 👋");
    }

    InitializerBlocks() {}

    InitializerBlocks(String someCuteAnimalEmojiBecauseIAmTiredOfJavaTheory) {
       this.someCuteAnimalEmojiBecauseIAmTiredOfJavaTheory = someCuteAnimalEmojiBecauseIAmTiredOfJavaTheory;
       System.out.println("Cute Animal is " + someCuteAnimalEmojiBecauseIAmTiredOfJavaTheory);
    }

    // we can have multiple initializer blocks
    // static initializer blocks will always run first and only ONCE
    // when class is loading to memory
    static {
        System.out.println("Static initializer block is running 💃");
    }



    public static void main(String[] args) {
        InitializerBlocks iB = new InitializerBlocks();

        InitializerBlocks iB2 = new InitializerBlocks("🦭");
        InitializerBlocks iB3 = new InitializerBlocks("🦇");
        InitializerBlocks iB4 = new InitializerBlocks("🐴");
   }
}
