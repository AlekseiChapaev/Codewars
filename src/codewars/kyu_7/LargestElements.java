package codewars.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestElements {
    /**
     * https://www.codewars.com/kata/53d32bea2f2a21f666000256/train/java
     */
    public static int[] largest(int n, int[] arr) {
        return IntStream.of(arr).sorted().skip(arr.length - n).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largest(2, new int[]{1, 4, 4, 8, 5, 7})));

    }
}
