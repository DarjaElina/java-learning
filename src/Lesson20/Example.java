package Lesson20;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<StringBuilder> animals = new ArrayList<>();
        StringBuilder cat = new StringBuilder("Cat");
        StringBuilder dog = new StringBuilder("Dog");
        StringBuilder bird = new StringBuilder("Bird");
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).append(" 🧡");
        }
        for (StringBuilder animal : animals) {
            System.out.println(animal);
        }
    }
}
