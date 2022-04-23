package codewars;

import java.util.Arrays;

public class TakeTheFirstNElements {

    //https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java

    public static int[] take(int[] arr, int n) {
        if (n <= arr.length) {
            int[] res = new int[n];
            for (int i = 0; i < res.length; i++) {
                res[i] = arr[i];
            }
            return res;
        } else if(arr.length == 0){
                return null;
        } else {
            return new int[0];
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{-49, -43, -11, 9}, 3)));

    }
}

