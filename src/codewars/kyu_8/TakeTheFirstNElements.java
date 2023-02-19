package codewars.kyu_8;

import java.util.Arrays;

public class TakeTheFirstNElements {

    //https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java

    public static int[] take(int[] arr, int n) {
        if (n < 0) {
            return new int[0];
        } else if (n > arr.length) {
            return arr;
        } else {
            int[] res = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                res[count++] = arr[i];
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{-49, -43, -11, 9, 11, 2, 5}, 10)));

    }
}

