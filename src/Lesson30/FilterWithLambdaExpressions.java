package Lesson30;

import java.util.ArrayList;

// the most flexible example using Java Lambda Expressions 😍

public class FilterWithLambdaExpressions {
}

class Student {
    String name;
    String gender;
    int age;
    int year;
    double averageGrade;

    Student(String name, String gender, int age, int year, double averageGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.year = year;
        this.averageGrade = averageGrade;
    }
}

class StudentInfo {
    void showStudentInfo(Student s) {
        System.out.println("Name: " + s.name + ", Gender: " + s.gender + ", Age: " + s.age + ", Year: " + s.year + ", Average grade: " + s.averageGrade);
    }

    void filterStudents(ArrayList<Student> students, StudentChecker sc) {
        for (Student s : students) {
            if (sc.checkStudent(s)) {
                showStudentInfo(s);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student john = new Student("John", "male", 22, 3, 6.0);
        Student jane = new Student("Jane", "female", 20, 1, 8.9);
        Student mary = new Student("Mary", "female", 19, 2, 5.9);
        Student bob = new Student("Bob", "male", 24, 5, 8.1);
        Student charles = new Student("Charles", "other", 22, 3, 8.7);
        students.add(john);
        students.add(jane);
        students.add(mary);
        students.add(bob);
        students.add(charles);

        StudentInfo si = new StudentInfo();

        // my first lambda expression 🥹👇
        si.filterStudents(students, (Student s) -> { return s.averageGrade >= 8.0; });
        System.out.println("-----------------------------------------------------------------");

        // more lambda expressions 😍
        si.filterStudents(students, (Student s) -> { return s.averageGrade < 9.0; });
        System.out.println("-----------------------------------------------------------------");
        si.filterStudents(students, (Student s) -> { return s.age < 25; });
        System.out.println("-----------------------------------------------------------------");
        si.filterStudents(students, (Student s) -> { return s.gender.equals("male"); });
        System.out.println("-----------------------------------------------------------------");
        si.filterStudents(students, (Student s) -> { return s.age >= 23 && s.gender.equals("other") && s.averageGrade >= 8.0; });
        System.out.println("-----------------------------------------------------------------");

        // shorter syntax example
        si.filterStudents(students, s -> s.age > 23 );
    }
}

// we can use lambda expressions
// only if we have one method inside the interface
// and no more than 1. ❗️
// this is an example of functional interface
interface StudentChecker {
    boolean checkStudent(Student s);
}