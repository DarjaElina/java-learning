package Homework.Lesson13;

public class Main {
    public static void main(String[] args) {
        Month december = new Month("December", 12);
        Month march = new Month("March", 3);
        Month april = new Month("April", 4);
        Month august = new Month("August", 8);
        Month february = new Month("February", 2);

        december.showDaysInMonth();
        march.showDaysInMonth();
        april.showDaysInMonth();
        august.showDaysInMonth();
        february.showDaysInMonth();
    }
}
