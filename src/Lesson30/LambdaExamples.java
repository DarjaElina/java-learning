package Lesson30;

public class LambdaExamples {
    static void printStringLength(LengthChecker checker) {
        System.out.println(checker.findLength("Hello Lambda"));
    }
    public static void main(String[] args) {
        printStringLength(s -> s.length());
    }
}

interface LengthChecker {
    int findLength(String str);
}
