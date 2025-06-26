package Lesson30;
import java.util.ArrayList;


// ❗️ why is this not perfect:
// because we are hardcoding the filter values.
// this is a bit better than the FilterWithMethods implementation,
// because we do not have to change filterStudents() inside StudentInfo class.
// but we still have a lot of repetitive code... 🫠

public class FilterWithInterface {
}

/* class Student {
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
        OverGradeStudentChecker overGradeChecker = new OverGradeStudentChecker();
        OverAgeStudentChecker underAgeChecker = new OverAgeStudentChecker();
        StudentCheckerByGender genderChecker = new StudentCheckerByGender();

        si.filterStudents(students, genderChecker);
        System.out.println("-----------------------------------------------------------------");
        si.filterStudents(students, overGradeChecker);
        System.out.println("-----------------------------------------------------------------");
        si.filterStudents(students, underAgeChecker);
        // and so on...
    }
}

interface StudentChecker {
    boolean checkStudent(Student s);
}

class OverGradeStudentChecker implements StudentChecker {
    public boolean checkStudent(Student s) {
        return s.averageGrade >= 8.5;
    }
}

class UnderGradeStudentChecker implements StudentChecker {
    public boolean checkStudent(Student s) {
        return s.averageGrade < 9.0;
    }
}

class OverAgeStudentChecker implements StudentChecker {
    public boolean checkStudent(Student s) {
        return s.age > 25;
    }
}

class UnderAgeStudentChecker implements StudentChecker {
    public boolean checkStudent(Student s) {
        return s.age < 27;
    }
}

class StudentCheckerByGender implements StudentChecker {
    public boolean checkStudent(Student s) {
        return s.gender.equals("male");
    }
}

class StudentCheckerByMixedConditions implements StudentChecker {
    public boolean checkStudent(Student s) {
       return (s.averageGrade >= 7.0 && s.age < 23 && s.gender.equals("female"));
    }
} */

