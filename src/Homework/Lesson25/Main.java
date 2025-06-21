package Homework.Lesson25;

// Animal, Mammal, Bird, Penguin, Fish, Mechenosec, Lion
public class Main {
    public static void main(String[] args) {

        // Penguin, Bird, Mammal, Lion can be Speakable
        Speakable penguin = new Penguin("Penguin");
        Speakable lion = new Lion("Lion");
        Penguin penguin1 = new Penguin("Penguin1");
        Speakable lion1 = new Lion("Lion2");
        Bird penguin2 = new Penguin("Penguin2");
        Mammal lion2 = new Lion("Lion3");

        Speakable[] speakables = {penguin, penguin1, penguin2, lion, lion1, lion2};
        for (Speakable speakable : speakables) {
            if (speakable instanceof Penguin) {
                ((Penguin)speakable).fly();
            }
            if (speakable instanceof Lion) {
                ((Lion)speakable).run();
            }
        }

        // Mammal, Bird, Penguin, Fish, Mechenosec, Lion can be Animals
        // only Lion, Penguin and Mechenosec can be instantiated

        Animal lion3 = new Lion("Lion3");
        Animal penguin3 = new Penguin("Penguin3");
        Animal mechenosec = new Mechenosec("Mechenosec");
        Fish mechenosec1 = new Mechenosec("Mechenosec1");
        Mechenosec mechenosec2 = new Mechenosec("Mechenosec2");
        Lion lion4 = new Lion("Lion4");

        Animal[] animals = {lion2, lion3, lion4, mechenosec, mechenosec1, mechenosec2, penguin1, penguin2, penguin3};
        for (Animal animal : animals) {
            if (animal instanceof Penguin) {
                ((Penguin)animal).fly();
            }
            if (animal instanceof Lion) {
                ((Lion)animal).run();
            }
            if (animal instanceof Mechenosec) {
                ((Mechenosec)animal).swim();
            }
        }
    }
}
