package Lesson23;

public class PolymorphismBasics {
    public static void main(String[] args) {
        // ❗️ variable can have a reference to a subclass object
        Employee employee2 = new Developer(); // ✅ this is possible in Java
        Developer developer1 = new BackendDeveloper(); // ✅ okay
        Employee employee3 = new BackendDeveloper(); //✅ also okay

        // but not vice versa 👇
        // Developer developer1 = new Employee(); ❌ compiler error

        // ✅ we can use attributes of super class on subclass instance
        employee2.walk();
        employee3.sleep();
        developer1.writeCode();

        // but not attributes of subclass on superclass instance 👇
        // employee2.writeCode(); ❌ Cannot resolve method 'writeCode' in 'Employee'
        // Even though employee2 is actually a Developer under the hood,
        // the compiler won't allow access to methods that are only known to Developer

        // same here 👇
        // developer.createDBConnection(); ❌ compiler error

    }
}
