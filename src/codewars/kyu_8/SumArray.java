package codewars.kyu_8;

import java.util.Arrays;

public class SumArray {
    //https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(new double[]{1, 5.2, 4, 0, -1}));
    }
}
