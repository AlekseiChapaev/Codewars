package codewars.kyu_8;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return 0;
        }
        else {
//            int max = Arrays.stream(numbers).max().getAsInt();
//            int min = Arrays.stream(numbers).min().getAsInt();
//            return Arrays.stream(numbers).sum() - max - min;

            return Arrays.stream(numbers).sorted().skip(1).limit(numbers.length - 2).sum();
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] { 6, 2, 1, 8, 10}));
    }
}
