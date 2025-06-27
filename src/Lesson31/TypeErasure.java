package Lesson31;

import java.util.ArrayList;

public class TypeErasure {
    public static void main(String[] args) {
        // when we write code like this
        ArrayList<Integer> list = new ArrayList<>();
        // JVM actually sees it like this:
        // ArrayList list = new ArrayList();

        // so, when we do, for example:
        int i = list.get(0);

        // this is what JVM sees:
        // int i = (Integer)list.get(0);
        // because from here
        // ArrayList list = new ArrayList()
        // list.get(0); would return Object
        // so we first cast Object to Integer, and then assign value to the variable

        // type erasure is very important for backward compatibility
    }
}
