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
                System.out.println("31 days in the month");
                break;
            case 2:
                System.out.println("28 days in the month");
                break;
            case 3:
                System.out.println("31 days in the month");
                break;
            case 4:
                System.out.println("30 days in the month");
                break;
            case 5:
                System.out.println("31 days in the month");
                break;
            case 6:
                System.out.println("30 days in the month");
                break;
            case 7:
                System.out.println("31 days in the month");
                break;
            case 8:
                System.out.println("31 days in the month");
                break;
            case 9:
                System.out.println("30 days in the month");
                break;
            case 10:
                System.out.println("31 days in the month");
                break;
            case 11:
                System.out.println("30 days in the month");
                break;
            case 12:
                System.out.println("31 days in the month");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
