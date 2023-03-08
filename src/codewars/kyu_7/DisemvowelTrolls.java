package codewars.kyu_7;

public class DisemvowelTrolls {
    /**
     * https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
     */
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("No offense but,\\nYour writing is among the worst I've ever read"));
    }
}
