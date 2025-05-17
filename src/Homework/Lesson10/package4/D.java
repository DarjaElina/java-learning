package Homework.Lesson10.package4;

import Homework.Lesson10.package1.A;
import static Homework.Lesson10.package1.package2.B.name;
import Homework.Lesson10.package1.package2.package3.C;
import Homework.Lesson10.package4.package5.E;

public class D {
    public static void main(String[] args) {
        A a = new A ();
        C c = new C ();
        E e = new E ();
        System.out.println("Class A name is: " + a.name);
        System.out.println("Class B static name is: " + name);
        System.out.println("Class C name is: " + c.name);
        System.out.println("Class E name is: " + e.name);
    }
}
