package codewars;

import java.util.List;
import java.util.stream.Collectors;

public class SortMyTextbooks {
    /**
     * https://www.codewars.com/kata/5a07e5b7ffe75fd049000051/train/java
     */
    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
    }
}
