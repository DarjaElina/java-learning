package Lesson26;

public class ToString {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream("Vanilla", "Chocolate syrup");
        System.out.println(iceCream.toString()); // prints Lesson26.IceCream@1b0375b3 unless we override toString()
        // after overriding prints Ice Cream Flavor: Vanilla, Topping: Chocolate syrup
    }
}

class IceCream {
    String flavor;
    String topping;

    IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }

    public String toString() {
        return "Ice Cream Flavor: " + flavor + ", Topping: " + topping;
    }
}
