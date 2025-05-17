package Lesson10;

import Lesson4.Car;
//import Lesson9.Student;
import Lesson9.*; // this means that we import all classes from Lesson9 package
// import Lesson8.*; // if we import everything from 2 packages, and there are classes with the same name => error
// Reference to 'Student' is ambiguous, both 'Lesson9.Student' and 'Lesson8.Student' match
import java.lang.*; // this is default import inside every class
// for example, classes String, System are part of java.lang
// import Homework.*; Calculator lives inside Homework.Lesson8, this would be an error
import Homework.Lesson8.*; // correct way of importing subpackages
import static Lesson7.Employee.count; // now we can use count instead of Employee.count

public class A {
    public static void main(String[] args) {
        Car car = new Car();
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(Student.count);
        System.out.println(car);
        Calculator calculator = new Calculator();
        System.out.println(count);
    }
}
