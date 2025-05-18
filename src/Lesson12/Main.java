package Lesson12;

public class Main {

    static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Max: " + a);
        } else if (b > a && b > c) {
            System.out.println("Max: " + b);
        } else {
            System.out.println("Max: " + c);
        }
    }

    static void test() {
        String str;
        int a = 5;
        if (a >= 10) {
            str = "Hello";
        } else if (a < 10) {
            str = "World";
        }
        // System.out.println(str); // error Variable 'str' might not have been initialized, even though we considered all scenarios and it WILL be initialized

        if (a >= 10) {
            str = "Hello";
        } else {
            str = "World";
        }
        System.out.println(str); // this works fine
    }

    public static void main(String[] args) {
        int a = 30;
        if (a <= 20) {
            System.out.println("a is less than 20");
        } else {
            System.out.println("a is greater than 20");
        }

        int salary = 300;
        if (salary < 200) {
            System.out.println("Salary is very small");
        } else if (salary < 400) {
            System.out.println("Salary is average");
        } else if (salary < 600) {
            System.out.println("Salary is big");
        } else {
            System.out.println("Salary is good");
        }

        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("c1's engine power and door amount are greater than c2's");
            }
            else {
                System.out.println("c1's engine power is greater and door amount is less than c2's");
            }
        } else {
            System.out.println("c1's engine power is less than c2's");
        }

        Car c3 = new Car(3, 4);
        System.out.println("c1 equals c3: " + c1.equals(c3)); // still false 🤔
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3 == s4); // cannot compare Strings created as objects using ==, need to use .equals()
        System.out.println(s3.equals(s4));

        Main.max(10, 2, 3);

       int c = 10;
       int d = 5;
       int max = c > d ? c : d;
       System.out.println(max);
    }
}
