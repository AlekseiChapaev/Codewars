package codewars.kyu_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountTheMonkeys {

    /**
     * https://www.codewars.com/kata/56f69d9f9400f508fb000ba7/train/java
     */
    public static int[] monkeyCount(final int n) {

        return IntStream.rangeClosed(1, n).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(5)));
    }
}
