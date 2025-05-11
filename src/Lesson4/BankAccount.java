package Lesson4;

// class in Java is a reference data type
public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {


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
        account.id = 3;
        account.name = "Jane";
        account.balance = 267.76;
    }
}
