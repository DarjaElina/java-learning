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
}