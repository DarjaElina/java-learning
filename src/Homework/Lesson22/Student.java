package Homework.Lesson22;

public class Student {
    private StringBuilder name;
    private int year;
    private int grade;

    public StringBuilder getName() {
        StringBuilder copiedName = new StringBuilder(name);
        return copiedName;
    }
    public int getYear() {
        return year;
    }
    public int getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name != null && name.length() > 3) {
            this.name = name;
        }
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 4) {
            this.year = year;
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Year: " + getYear());
        System.out.println("Grade: " + getGrade());
    }
}
