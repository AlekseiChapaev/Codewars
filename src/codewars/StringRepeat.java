package codewars;

public class StringRepeat {

    // https://www.codewars.com/kata/57a0e5c372292dd76d000d7e

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(5, "Hi"));
    }
}
