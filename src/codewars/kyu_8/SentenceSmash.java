package codewars.kyu_8;

public class SentenceSmash {

    //https://www.codewars.com/kata/53dc23c68a0c93699800041d/train/java

    public static String smash(String... words) {
       String smash = "";
        for (int i = 0; i < words.length; i++) {
            smash = smash.concat(words[i]).concat(" ");
        }
        return smash.trim();
    }

    public static void main(String[] args) {

        System.out.println(smash("hello", "world", "this", "is", "great"));
    }
}
