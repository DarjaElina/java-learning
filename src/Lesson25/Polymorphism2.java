package Lesson25;

import Homework.Lesson10.package4.package5.E;

public class Polymorphism2 {
//    Driver[] drivers = {new Driver(), new Driver()};
//    Employee[] drivers1 = {new Driver(), new Teacher(), new Doctor()};
//    HelpCapable[] employees = {new Driver(), new Teacher(), new Doctor()};

   public static void main(String[] args) {
       Employee emp = new Teacher();
       Employee emp2 = new Driver();
       Employee emp3 = new Doctor();

       Employee[] employees = {emp, emp2, emp3};

       // polymorphism in action 2 👇
       for (Employee e : employees) {
           e.work();
       }
//       Teacher works
//       Driver works
//       Doctor works
   }
}
