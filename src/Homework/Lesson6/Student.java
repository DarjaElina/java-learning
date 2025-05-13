package Homework.Lesson6;

public class Student {
    int studentNumber;
    String firstName;
    String lastName;
    int yearOfStudy;
    float mathGrade;
    float englishGrade;
    float economyGrade;

    Student(int studentNumber1, String firstName1, String lastName1, int yearOfStudy1, float mathGrade1, float englishGrade1, float economyGrade1) {
        studentNumber = studentNumber1;
        firstName = firstName1;
        lastName = lastName1;
        yearOfStudy = yearOfStudy1;
        mathGrade = mathGrade1;
        englishGrade = englishGrade1;
        economyGrade = economyGrade1;
    }

    Student(int studentNumber1, String firstName1, String lastName1, int yearOfStudy1) {
        this(studentNumber1, firstName1, lastName1, yearOfStudy1, 0, 0, 0);
    }

    Student() {
        this(0, null, null, 0, 0, 0, 0);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Anna", "Smith", 3);
        Student s3 = new Student(2, "John", "Doe", 4, 3, 5, 2);

        System.out.println(s1.studentNumber);
        System.out.println(s2.firstName);
        System.out.println(s3.lastName);
    }
}
