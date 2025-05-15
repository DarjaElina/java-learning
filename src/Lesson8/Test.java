package Lesson8;

public class Test {

    public int a;

    // final variable is by default readonly
    public final int b = 20;

    // public final int c; => error; Field 'c' might not have been initialized
    // final variables do not have default values


    // but we can do this as long as we define final variable in EVERY constructor
    public final int c;

    public static final int d = 10; // static final variables must be initialized when we create them, not inside constructor

    public void sum(int a) {
        // we can use final modifier also with local variables
        final int b = 10;
        // b = 20; => error
        System.out.println(a + b);
    }

    // we can also have final parameters
   public void printString(final String s) {
        System.out.println(s);
        // s = "Updated String: " + s; => error
   }

    Test(int c) {
        this.c = c;
    }

    Test() {
        c = 10;
    }

    // We cannot create constructor without defining final variable there
//    Test() {
//        a = 10;
//    }

    public static void main(String[] args) {
        Test t = new Test(10);

        // everything works fine
        t.a = t.a * 2;
        System.out.println(t.a);

        // t.b = t.b * 2; => error, we cannot change value of variable with modifier final
        System.out.println(t.b);

        System.out.println(d);
    }
}

