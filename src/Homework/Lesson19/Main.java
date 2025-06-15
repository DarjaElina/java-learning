package Homework.Lesson19;

public class Main {
    public static String[] copyArgs(String... args) {
        String[] newArgs = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            newArgs[i] = args[i];
        }
        return newArgs;
    }
    public static void main(String[] args) {
        String[] arguments = copyArgs(args);
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = null;
        }
        for (String arg : arguments) {
            System.out.println(arg);
        }
    }
}
