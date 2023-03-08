package codewars.kyu_7;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.iterate;

public class ArithmeticProgression {
    /**
     * https://www.codewars.com/kata/55caf1fd8063ddfa8e000018/train/java
     */
    public static String arithmeticSequenceElements(int a, int d, long n) {

        return iterate(a, t -> t + d).limit(n).mapToObj(Integer::toString).collect(joining(", "));
    }

    public static void main(String[] args) {
        System.out.println(arithmeticSequenceElements(1, 1, 10));
    }
}
