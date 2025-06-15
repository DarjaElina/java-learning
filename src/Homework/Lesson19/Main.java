package Homework.Lesson19;

public class Main {
    public static String[] copyArgs(String... args) {
        String[] newArgs = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            newArgs[i] = args[i];
        }
        return newArgs;
    }

    // instructor's version
    public static String[] copyArgs(String[]... args) {
        int length = 0;
        for (String[] arg : args) {
            length += arg.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] arg : args) {
            for (String s : arg) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] arguments = copyArgs(args);
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = null;
        }
        for (String arg : arguments) {
            System.out.println(arg);
        }

        // instructor's version
        String[] target = copyArgs(new String[]{"Moi", "Hi", "Hello"}, new String[]{"Hei", "Privet", "Buona sera"});

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }
        }
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
