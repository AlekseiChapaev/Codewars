package codewars.kyu_8;

import java.util.Arrays;

public class ArrayMean {
    /**
     * https://www.codewars.com/kata/55d277882e139d0b6000005d
     */
    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).sum() / nums.length;
    }

    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{1,3,5,7}));
    }
}
