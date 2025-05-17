package Lesson9;

public class Student {

}
class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3;
        s1 = null; // now s1 no longer points to the created object
        s1 = new Student(); // now it points to new object
    }
}
