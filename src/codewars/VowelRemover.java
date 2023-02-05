package codewars;

public class VowelRemover {
    /**
     * https://www.codewars.com/kata/5547929140907378f9000039
     *
     * Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.
     *
     * Examples
     * "hello"     -->  "hll"
     * "codewars"  -->  "cdwrs"
     * "goodbye"   -->  "gdby"
     * "HELLO"     -->  "HELLO"
     * don't worry about uppercase vowels
     */

    public static String shortcut(String row){
        return row.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        System.out.println(shortcut("codewars"));
    }
}
