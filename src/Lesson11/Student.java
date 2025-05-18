package Lesson11;

public class Student {
    public String name;
    public int year;
    public double grade;

    public Student(String name, int year, double grade) {
        this.name = name;
        this.year = year;
        this.grade = grade;
    }

    // how can we swap variables so that student1 will point to new Student("Jack", 1, 7.5); and student2 to new Student("Jane", 2, 9.5);?
    // we need a helper temporary variable

    public static void swap(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println(s1.name); //should be Jack now
        System.out.println(s2.name); // should be Jane now
    }

    public static void changeName(Student s) {
        s.name = "Anna";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Jane", 2, 9.5);
        Student student2 = new Student("Jack", 1, 7.5);
        swap(student1, student2);
        System.out.println(student1.name); //should be Jack now
        System.out.println(student2.name); // should be Jane now
        // but we see that nothing has changed. 🤔

        // ❗️ when we use reference data type as parameter, we actually use its COPY ❗️

        Student.changeName(student2);
        System.out.println(student2.name);

    }
}
