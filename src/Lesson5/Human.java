package Lesson5;

public class Human {
    String name;
    AnotherCar car;
    BankAccount bankAccount;

    void showInfo() {
        System.out.println("Name: " + name + ", Car color: " + car.color + ", Account balance: " + bankAccount.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new AnotherCar("green", "V8");
        h.bankAccount = new BankAccount(1, 200.5);
        h.showInfo();
    }
}

class AnotherCar {
    String color;
    String engine;
    AnotherCar(String newColor, String newEngine) {
        color = newColor;
        engine = newEngine;
    }
}

class BankAccount {
    int id;
    double balance;
    BankAccount(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
    }
}
