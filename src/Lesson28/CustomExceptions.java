package Lesson28;

public class CustomExceptions {
    void marathon(int temperature, int speed) throws twistedAnkleException {
        if (speed > 12) {
            throw new twistedAnkleException("You've been running too fast: " + speed);
        }
        if (temperature < 5) {
            throw new crampedMuscleException("Too cold! Muscles may cramp below 5°C");
        }
        System.out.println("You finished the marathon! 👏");
    }

    public static void main(String[] args) {
        CustomExceptions customExceptions = new CustomExceptions();
        try {
            customExceptions.marathon(20, 10); // cold but not too fast
        } catch (twistedAnkleException e) {
            System.out.println("Ankle problem: " + e.getMessage());
        } catch (crampedMuscleException e) {
            System.out.println("Muscle problem: " + e.getMessage());
        } finally {
            System.out.println("You get a medal anyway 🫶");
        }
    }
}

// let's imagine, we are running a marathon
// and here is what can go wrong

class twistedAnkleException extends Exception {
    // Exception class has two constructors,
    // One without parameters
    // And one with String parameter, where String will be an Exception message

    twistedAnkleException(String message) {
      super(message);
    }
}

class crampedMuscleException extends RuntimeException {
    crampedMuscleException(String message) {
        super(message);
    }
    crampedMuscleException() {}
}