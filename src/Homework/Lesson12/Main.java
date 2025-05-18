package Homework.Lesson12;
import Lesson11.Student;

public class Main {
    public static void equals(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.year == s2.year && s1.grade == s2.grade) {
            System.out.println("Two Students are equal");
        } else {
            System.out.println("Two Students are not equal");
        }
    }

    public static void nestedEquals(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.year == s2.year) {
                if (s1.grade == s2.grade) {
                    System.out.println("Two Students names, years and grades are equal");
                } else {
                    System.out.println("Two Students names and years are equal; grades are not equal");
                }
            } else {
                System.out.println("Two Students names are equal, years and grades are not equal");
            }
        } else {
            System.out.println("Two Students names, years and grades are not equal");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Mark", 1, 5.0);
        Student s2 = new Student("Mark", 1, 5.0);

        equals(s1, s2);
        nestedEquals(s1, s2);

    }
}
