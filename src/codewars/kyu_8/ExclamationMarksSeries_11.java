package codewars.kyu_8;

public class ExclamationMarksSeries_11 {
    /**
     * https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed/train/java
     */
    public static String replace(final String s) {
        return s.replaceAll("[aeiouyAEIOUY]", "!");
    }
}
