package codewars.kyu_8;

public class Training {

    public static String replace(final String s) {
        return s.replaceAll("[aeuioAEIOU]", "!");

    }

    public static void main(String[] args) {
        System.out.println(replace("ABCDE"));
    }

}
