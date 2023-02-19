package codewars.kyu_7;

import java.util.stream.LongStream;

public class SumOfCubes {
    /**
     * https://www.codewars.com/kata/59a8570b570190d313000037/train/java
     */
    public static long sumCubes(long n) {
        return LongStream.rangeClosed(1, n).map(s -> s * s * s).sum();
    }

    public static void main(String[] args) {
        System.out.println(sumCubes(2));
    }
}
