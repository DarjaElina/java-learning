package Lesson16;

public class MethodChaining {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hey!";
        String s3 = s1.concat(s2).trim().replace("Hey!", "Terve").substring(6, 10);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
