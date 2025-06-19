package Homework.Lesson23.Test2.p2;
import Homework.Lesson23.Test2.p1.*;

public class Y extends X {
    public void abc() {
        System.out.println("Y");
    }
    public void def() {
       Y y = new Y();
       y.abc();
    }

    public void ghi() {
        X x = new Y();
        x.abc(); // ❌ error here
        // because even though abc() has protected access modifier, it can be called only from the same package
        // OR subclass
        // here we are trying to call it from X, not from Y (which is subclass)
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
        y.def();
        y.ghi();
    }
}
