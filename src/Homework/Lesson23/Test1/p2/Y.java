package Homework.Lesson23.Test1.p2;
import Homework.Lesson23.Test1.p1.*;

public class Y extends X {
    Y() {} // ❌ error
    // because constructor in X is default!
    // it is not visible inside another package

    public void abc() {
        System.out.println("Y");
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
