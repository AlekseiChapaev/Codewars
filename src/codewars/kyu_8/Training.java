package codewars.kyu_8;

import java.util.Arrays;

public class Training {

    public static String smash(String... words) {
        if (words.length > 0) {
            return Arrays.stream(words).reduce((s1, s2) -> s1.concat(" ").concat(s2)).get();
        }
        else return null;
    }

    public static void main(String[] args) {
//        System.out.println(smash("hello", "world", "this", "is", "great"));

        String a = "hello";
        String b = "world";
//        System.out.println(String.join(" ", a, b));
        System.out.println(String.join("*", a, b, "hd"));

    }

}
