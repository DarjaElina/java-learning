package Homework.Lesson28;

public class Tiger {
    public void eat(String food) throws IsNotAMeatException {
       if (food != null) {
           if (food.equalsIgnoreCase("meat")) {
               System.out.println("Tiger eats " + food);
           } else throw new IsNotAMeatException("Tiger does not eat " + food);
       }
    }

    public void drink(String drink) throws IsNotWaterException {
        if (drink != null) {
            if (drink.equalsIgnoreCase("water")) {
                System.out.println("Tiger drinks " + drink);
            } else throw new IsNotWaterException("Tiger does not drink " + drink);
        }
    }
}

class IsNotAMeatException extends RuntimeException {
    IsNotAMeatException(String message) {
        super(message);
    }
}

class IsNotWaterException extends Exception {
    IsNotWaterException(String message) {
        super(message);
    }
}
