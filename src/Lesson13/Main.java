package Lesson13;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(5);
        if (s.grade == 2) {
            System.out.println("Student has bad grades");
        } else if (s.grade == 3) {
            System.out.println("Student has average grades");
        } else if (s.grade == 4) {
            System.out.println("Student has good grades");
        } else if (s.grade == 5) {
            System.out.println("Student has excellent grades");
        } else {
            System.out.println("Invalid grade");
        }

        switch (s.grade) {
            case 2:
                System.out.println("Student has bad grades");
                break;
            case 3:
                System.out.println("Student has average grades");
                break;
            case 4:
                System.out.println("Student has good grades");
                break;
            case 5:
                System.out.println("Student has excellent grades");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
