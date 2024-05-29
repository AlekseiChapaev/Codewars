package codewars.kyu_7;


import java.util.Arrays;
import java.util.stream.IntStream;

public class BasicSequencePractice {

    //https://www.codewars.com/kata/5436f26c4e3d6c40e5000282/train/java

    public static int[] sumOfN(int n) {

//        int[] res = new int[Math.abs(n)];
//        for (int i = 1; i < res.length; i++) {
//            res[i] = res[i - 1] + i;
//        }
//
//        if (n < 0) {
//            res = Arrays.stream(res).map(a-> a * (-1)).toArray();
//        };
//
//        return res;

        if (n > 0) {
            return IntStream
                    .rangeClosed(0, n)
                    .map(i -> i * (i + 1) / 2)
                    .toArray();
        } else
            return IntStream
                    .rangeClosed(0, Math.abs(n))
                    .map(i -> -i * (i + 1) / 2)
                    .toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN(2)));
    }
}
