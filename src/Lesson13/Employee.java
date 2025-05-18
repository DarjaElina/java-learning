package Lesson13;

public class Employee {
    public static void main(String[] args) {
        String weekday = "Tuesday";
        switch(weekday) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working hours: 09:00-18:00");
                break;
            case "Saturday":
                System.out.println("Working hours: 09:00-14:00");
                break;
            case "Sunday":
                System.out.println("We are closed!");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
}
