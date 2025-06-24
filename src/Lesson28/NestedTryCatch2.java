package Lesson28;

public class NestedTryCatch2 {
    void method() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            System.out.println(s.length()); // this can be caught only inside inner try/catch
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception"); // this System.out.println(s.length()); will not be caught here
        }
    }

    public static void main(String[] args) {
        NestedTryCatch2 nestedTryCatch2 = new NestedTryCatch2();
        nestedTryCatch2.method();
    }
}
