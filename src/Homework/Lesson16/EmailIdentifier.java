package Homework.Lesson16;

public class EmailIdentifier {
    public static void showEmailProviders(String emails) {
        for (int i = 0; i < emails.length(); i++) {
            char c = emails.charAt(i);
            if (c == '@') {
                int j = i + 1;
                while (emails.charAt(j) != '.') {
                    System.out.print(emails.charAt(j));
                    j++;
                }
                System.out.println();
            }
        }
    }

    public static void email(String emails) {
        int a = 0; // position of @
        int b = 0; // position of .
        int c = 0; // position of ;

        while (c < emails.length() - 1) {
            a = emails.indexOf('@', c);
            b = emails.indexOf('.', c);
            c = emails.indexOf(';', c + 1);
            System.out.println(emails.substring(a + 1, b));
        }
    }
}