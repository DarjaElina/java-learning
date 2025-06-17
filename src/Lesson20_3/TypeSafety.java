package Lesson20_3;

import java.util.ArrayList;
class Car {}

public class TypeSafety {
    public static void main(String[] args) {
        ArrayList books = new ArrayList<>();
        books.add("Jane Eyre");
        books.add("To Kill a Mockingbird");
        books.add("The Hobbit");
        books.add(new Car()); // ❗️ compiler allows to do that, but...
        for (Object book : books) {
            System.out.println("📕 Book: " + book + ", Title length: " + ((String)book).length()); // 💥 runtime Exception
        }

        // That is why we should write type safe code:
        ArrayList<String> books2 = new ArrayList<>(); // notice <String> here
        books2.add("Jane Eyre");
        books2.add("To Kill a Mockingbird");
        books2.add("The Hobbit");
        //books2.add(new Car()); // ❗️ compiler error Required type: String, Provided: Car
    }
}
