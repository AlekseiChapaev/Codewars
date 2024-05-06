package codewars.kyu_8;

import java.util.Arrays;

public class SquareN_Sum {
    //https://www.codewars.com/kata/515e271a311df0350d00000f/train/java

    public static int squareSum(int[] n) {
//        int res = 0;
//        for(int i : n) {
//            res += Math.pow(i, 2);
//        }
//        return res;

        return Arrays.stream(n).map(x -> x * x).sum();
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
    }
}
