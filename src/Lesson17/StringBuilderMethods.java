package Lesson17;
class Car{}

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // length()
        System.out.println(sb.length());

        // charAt();
        System.out.println(sb.charAt(3));

        // indexOf()
        // unlike String's method indexOf() we cannot use char parameter, only String
        System.out.println(sb.indexOf("llo"));
        // System.out.println(sb.indexOf('l')); compiler error
        System.out.println(sb.indexOf("l", 3));

        // substring()
        String s = sb.substring(2);
        System.out.println(s);
        String s2 = sb.substring(2, 4);
        System.out.println(s2);

        // subsequence()
        String greeting = "Hello World";
        StringBuilder greeting2 = new StringBuilder(greeting);
        System.out.println(greeting.subSequence(2, 4));
        System.out.println(greeting2.subSequence(2, 4));

        // append()
        // System.out.println(greeting.append(1)); does not work with Strings
        System.out.println(greeting2.append(1)); // works with StringBuilders
        System.out.println(greeting2.append(true));
        System.out.println(greeting2.append(1.11));
        System.out.println(greeting2.append("Something"));
        // append() does not create a new StringBuilder, it mutates existing one
        System.out.println(greeting2.append(new Car()));

        // insert()
        StringBuilder italianGreeting = new StringBuilder("Buon giorno!");
        System.out.println(italianGreeting.insert(3, "☀️"));

        // delete()
        System.out.println(italianGreeting.delete(2, 3));

        // deleteCharAt()
        System.out.println(italianGreeting.deleteCharAt(italianGreeting.length() - 1));

        // reverse()
        System.out.println(italianGreeting.reverse());

        // replace()
        System.out.println(new StringBuilder("Hello Everyone!").replace(6, 14, "Cats"));

        // capacity()
        System.out.println(new StringBuilder().capacity()); // default 16

    }
}
