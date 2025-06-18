package Homework.Lesson22;
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Jane Doe"));
        student.setYear(2);
        student.setGrade(9);
        student.showInfo();

        Dog dog = new Dog("Musti");
        Cat cat = new Cat("Mirri");
        System.out.println(dog.pawCount);
        cat.sleep();
    }
}
