package codewars.kyu_7;

import java.util.stream.IntStream;

public class SumOfNumbers {

    //https://www.codewars.com/kata/55f2b110f61eb01779000053

    public static int getSumTwoNumbers(int a, int b) {

        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
     }

    public static void main(String[] args) {
        System.out.println(getSumTwoNumbers(-2, -1));
    }
}
