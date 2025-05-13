package Lesson4;

// class in Java is a reference data type
public class BankAccount {
    int id;
    String name;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }
}

class TestBankAccount {
    public static void main(String[] args) {
        // creating new object
        BankAccount account = new BankAccount();
        System.out.println("account is" + account);
        // will print account isLesson4.BankAccount@566776ad
        // because it is a REFERENCE to the where created object is stored in memory

        account.id = 1;
        account.name = "Daria";
        account.balance = 14.90;

        System.out.println("account balance is " + account.balance);

        BankAccount account2 = new BankAccount();
        System.out.println("account2 balance is " + account2.balance); // will print 0.0 -> default value of double

        account2.id = 2;
        account2.name = "Anna";
        account2.balance = 2.00;

        BankAccount account3 = new BankAccount();
        account3.id = 3;
        account3.name = "Jane";
        account3.balance = 267.76;

        account3.deposit(2.00);
        System.out.println("account3 balance is " + account3.balance);

        account3.withdraw(10.00);
        System.out.println("account3 balance is " + account3.balance);
    }
}
