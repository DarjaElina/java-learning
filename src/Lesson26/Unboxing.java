package Lesson26;

import java.util.ArrayList;

public class Unboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0); // unboxing example
        System.out.println(a);

        // another example
        Integer b = new Integer(5);
        int c = b; // ✅ good

        // parse() examples
        String stringInt = "50";
        String stringDouble = "5.5";
        String stringBoolean = "true";
        int i = Integer.parseInt(stringInt);
        double d = Double.parseDouble(stringDouble);
        boolean bool = Boolean.parseBoolean(stringBoolean);
        System.out.println(i);
        System.out.println(d);
        System.out.println(bool);

        // parseBoolean is a little but different
        // anything except exact match "true" or "TRUE" will be false
        String stringBoolean2 = "trueee";
        boolean bool2 = Boolean.parseBoolean(stringBoolean2);
        System.out.println(bool2); // false

        // valueOf()
        Integer integer = Integer.valueOf("10");
        String string = String.valueOf(50);
        Double doubleValue = Double.valueOf("5.5");



    }
}
