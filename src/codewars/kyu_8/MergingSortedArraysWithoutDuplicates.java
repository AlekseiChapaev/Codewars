package codewars.kyu_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergingSortedArraysWithoutDuplicates {
    /**
     * https://www.codewars.com/kata/573f5c61e7752709df0005d2/train/java
     */
    public static int[] mergeArrays(int[] first, int[] second) {

        return IntStream.concat(Arrays.stream(first), Arrays.stream(second)).distinct().sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 })));

    }
}
