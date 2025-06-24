package Homework.Lesson28;

import Homework.Lesson10.package4.package5.E;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("meat");

        try {
            tiger.drink("water");
            try {
                tiger.drink("beer");
            } catch (IsNotWaterException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("This is inner finally block");
            }
        }  catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
