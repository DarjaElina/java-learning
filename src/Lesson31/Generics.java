package Lesson31;
import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        // without generics; raw type
        ArrayList rawList = new ArrayList();
        // we even get a compiler warning: Raw use of parameterized class 'ArrayList'

        // with <> (diamond operator), strong typing
        ArrayList<String> typedList = new ArrayList<>();


        // Parameterized class usage
        LotusFlower<String> lotus = new LotusFlower<>("The lotus is a flower with a rich backstory.");
        System.out.println(lotus);

        // the compiler will not allow that
        //´LotusFlower<Integer> lotus2 = new LotusFlower<>("About 70% of lotus for human consumption is produced in China.");
        // Required type: LotusFlower <Integer> Provided: LotusFlower <String>

        LotusFlower<Integer> lotus2 = new LotusFlower<>(100); // ✅ all good

        String lotusInfo = lotus.getValue(); // ✅ all good
        // String lotusInfo2 = lotus2.getValue(); ❌ Required type: String Provided: Integer
    }
}

// Parameterized class example

class LotusFlower<T> {
    private T value;

    public LotusFlower(T value) {
        this.value = value;
    }

    public String toString() {
        return "🪷 " + value + " 🪷";
    }

    public T getValue() {
        return value;
    }
}
