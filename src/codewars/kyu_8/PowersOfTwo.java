package codewars.kyu_8;

import java.util.Arrays;
import java.util.stream.LongStream;

public class PowersOfTwo {
    //https://www.codewars.com/kata/57a083a57cb1f31db7000028/train/java
    public static long[] powersOfTwo(int n){
//        long[] res = new long[n + 1];
//        for (int i = 0; i <= n; i++) {
//            res[i] = (long)Math.pow(2, i);
//        }
//
//        return res;

        return LongStream.rangeClosed(0, n).map(i -> (int)Math.pow(2, i)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(4)));
    }
}
