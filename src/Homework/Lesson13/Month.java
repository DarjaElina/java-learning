package Homework.Lesson13;

public class Month {
    public String name;
    public int number;

    public Month(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void showDaysInMonth() {
        switch (this.number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in the month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in the month");
                break;
            case 2:
                System.out.println("28 days in the month");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
