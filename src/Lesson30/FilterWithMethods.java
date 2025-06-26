package Lesson30;

// Let's imagine we are making an app for filtering students' information.
// We have quite a lot of repetitive code 👇,
// and if we need more filtering options in the future,
// there going to be even more...

public class FilterWithMethods {
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

    void showStudentsOverGrade(ArrayList<Student> students, double averageGrade) {
        for (Student s : students) {
            if (s.averageGrade > averageGrade) {
                showStudentInfo(s);
            }
        }
    }

    void showStudentsUnderGrade(ArrayList<Student> students, double avgGrade) {
        for (Student s : students) {
            if (s.averageGrade < avgGrade) {
                showStudentInfo(s);
            }
        }
    }

    void showStudentsOverAge(ArrayList<Student> students, int age) {
        for (Student s : students) {
            if (s.age > age) {
                showStudentInfo(s);
            }
        }
    }

    void showStudentsUnderAge(ArrayList<Student> students, int age) {
        for (Student s : students) {
            if (s.age < age) {
                showStudentInfo(s);
            }
        }
    }

    void filterStudentsByGender(ArrayList<Student> students, String gender) {
        for (Student s : students) {
            if (s.gender.equalsIgnoreCase(gender)) {
                showStudentInfo(s);
            }
        }
    }

    void filterStudentsByMixedConditions(ArrayList<Student> students, double avgGrade, int age, String gender) {
        for (Student s : students) {
            if (s.averageGrade > avgGrade && s.age < age && s.gender.equalsIgnoreCase(gender)) {
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
        si.showStudentsOverGrade(students, 8.5);
        System.out.println("-----------------------------------------------------------------");
        si.showStudentsUnderGrade(students, 7.0);
        System.out.println("-----------------------------------------------------------------");
        si.showStudentsOverAge(students, 20);
        System.out.println("-----------------------------------------------------------------");
        si.showStudentsUnderAge(students, 21);
        System.out.println("-----------------------------------------------------------------");
        si.filterStudentsByGender(students, "male");
        System.out.println("-----------------------------------------------------------------");
        si.filterStudentsByMixedConditions(students, 8.1, 21, "female");
    }
} */
