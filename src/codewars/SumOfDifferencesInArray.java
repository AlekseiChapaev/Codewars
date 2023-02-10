package codewars;

import java.util.Arrays;

public class SumOfDifferencesInArray {
    /**
     * https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/solutions/java
     */
    public static int sumOfDifferences(int[] arr) {
        int res = 0;
        if(arr == null || arr.length < 2){
            return res;
        } else{
            Arrays.sort(arr);
            int count = 1;
            for (int i = arr.length - count; i > 0; i--) {
                res += arr[arr.length - count] - arr[arr.length - (count + 1)];
                count++;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
    }
}
