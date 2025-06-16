package Lesson20;
import java.util.ArrayList;
import java.util.List;

class Car {};
class Student {};

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Hello");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("Moi"));

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        // list2.add(s); ❌ Compiler error: Required type: String Provided: Student

        ArrayList<StringBuilder> list3 = new ArrayList<>();

        List<StringBuilder> list4 = new ArrayList<>();

        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list2 == list5); // ❗️ false, they point to different objects in memory
    }
}
