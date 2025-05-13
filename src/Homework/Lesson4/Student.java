package Homework.Lesson4;

public class Student {
    int studentNumber;
    String firstName;
    String lastName;
    int yearOfStudy;
    float mathGrade;
    float englishGrade;
    float economyGrade;
}

class StudentTest {

    static void showAverage(Student s) {
        float average = (s.mathGrade + s.englishGrade + s.englishGrade) / 3;
        System.out.println("Average grade: "+ average);
    }
    public static void main(String[] args) {
        Student Anna = new Student();
        Anna.studentNumber = 10;
        Anna.firstName = "Anna";
        Anna.lastName = "Smith";
        Anna.yearOfStudy = 2018;
        Anna.mathGrade = 3.6f;
        Anna.englishGrade = 2.4f;
        Anna.economyGrade = 4.8f;
        System.out.println("Anna's math grade is " + Anna.mathGrade);
        System.out.println("Anna's englishGrade is " + Anna.englishGrade);
        System.out.println("Anna's economyGrade is " + Anna.englishGrade);

        Student John = new Student();
        John.studentNumber = 11;
        John.firstName = "John";
        John.lastName = "Doe";
        John.yearOfStudy = 2022;
        John.mathGrade = 5.0f;
        John.englishGrade = 2.9f;
        John.economyGrade = 3.6f;
        System.out.println("John's math grade is " + John.mathGrade);
        System.out.println("John's englishGrade is " + John.englishGrade);
        System.out.println("John's economyGrade is " + John.economyGrade);

        float annaAverage = (Anna.mathGrade + Anna.englishGrade + Anna.englishGrade) / 3;
        float johnAverage = (John.mathGrade + John.englishGrade + John.englishGrade) / 3;

        System.out.println("Anna's average grade is " + annaAverage);
        System.out.println("John's average grade is " + johnAverage);

        StudentTest.showAverage(John);
        StudentTest.showAverage(Anna);
    }
}
