package Lesson30_2;

import java.util.ArrayList;

public class InferenceType {
    static double getPi() {
        return 3.14;
    }
    public static void main(String[] args) {
        // we can do as usually
        ClassWithVeryLongName classWithVeryLongName = new ClassWithVeryLongName();

        // but we can also do
        var classWithVeryLongName2 = new ClassWithVeryLongName();
        // java is smart enough to understand
        // that if on the right hand of the expression we use ClassWithVeryLongName
        // then var will be of this type

        // ✅ how else we can use var
        var i = 10; // the compiler understands that this is an int
        var f = 1.5f; // float
        var array = new String[]{"a", "b", "c"};
        var array2 = new int[]{1, 2, 3};

        // assigning method return value
        var result = getPi();

        Object hello = "Hello";
        var hello2 = hello; // hello2 will be of type Object

        ArrayList<String> arrayList = new ArrayList<>();
        for (var s: arrayList) {
            System.out.println(s);
        }

        // var is not a reserved keyword
        // so we can technically do this...
        var var = "var"; // 🤔

        // ❌ how we cannot use var
        // outside of method
        // as method parameter or return type
        // without assigning a value to it
        // assign it to null

        // var h; Cannot infer type: 'var' on variable without an initializer ❌
        // var n = null; Cannot infer type: variable initializer is 'null' ❌
        // var[] array2 = new int[] {1, 2, 3}; ❌
    }
    // var n = 6; ❌
    // var is not allowed here

    // void notAllowedMethod(var n) {} ❌
    // and here

    // var returnVar() {}
    // and like this
}

class ClassWithVeryLongName {}
