package codewars.kyu_7;

public class Trigrams {

    //https://www.codewars.com/kata/55d8dc4c8e629e55dc000068

    public static String trigrams(String phrase) {
        if (phrase.length() < 3) return "";
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < phrase.length() - 2; i++) {
                sb.append(phrase.replaceAll(" ", "_").substring(i, i + 3));
                sb.append(" ");
            }

            return sb.toString().trim();
        }
    }

    public static void main(String[] args) {
        System.out.println(trigrams("the quick red"));
    }
}
