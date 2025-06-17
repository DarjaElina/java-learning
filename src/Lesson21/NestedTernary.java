package Lesson21;

public class NestedTernary {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(num > 2 ? num < 5 ? 3 : 6 : 9); // will print 6 😑🙃
        // if num is greater than 2, print 9 (outer condition)
        // it's not, so we go inside
        // if num is less than 5 (which it is not), print 3
        // else print 6 ✅
    }
}
