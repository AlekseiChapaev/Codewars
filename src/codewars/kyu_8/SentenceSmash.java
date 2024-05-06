package codewars.kyu_8;

import java.util.Arrays;
public class SentenceSmash {

    //https://www.codewars.com/kata/53dc23c68a0c93699800041d/train/java

    public static String smash(String... words) {
//       String smash = "";
//        for (int i = 0; i < words.length; i++) {
//            smash = smash.concat(words[i]).concat(" ");
//        }
//        return smash.trim();
        if (words.length == 0) return "";
        return Arrays.stream(words).reduce((s1, s2) -> s1.concat(" ").concat(s2)).get();

    }

    public static void main(String[] args) {

        System.out.println(smash("hello", "world", "this", "is", "great"));
    }
}
