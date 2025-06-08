package Lesson15;

public class While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);

        int money = 100;
        while (money >= 0) {
            System.out.println("Place your bet");
            System.out.println("You lost");
            money -= 10;
        }

        boolean b = true;
        int a = 1;
        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0 ) {
                b = false;
            }
            a++;
        }

        int n = 5;
        while (n++ < 10) {
            n++;
        }
        System.out.println(n);

        int c = 5;
        while (c == 10) {
            System.out.println(c);
        }


    }
}
