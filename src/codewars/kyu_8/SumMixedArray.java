package codewars.kyu_8;

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {
        //https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/java

    public static int sum(List<?> mixed) {
        return mixed.stream()
                .mapToInt(i -> Integer.parseInt(String.valueOf(i)))
                .sum();

        //Stream.of(mixed)
        //      .map(i -> Integer.parseInt(String.valueOf(i)))
        //      .reduce((a, s) -> a + s).get();
    }

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    }
}
