package codewars;

import java.util.Arrays;

public class LarioAndMuigiPipeProblem {

    //https://www.codewars.com/kata/56b29582461215098d00000f/train/java

    public static int[] pipeFix(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        int[] arr = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + i;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] ar = new int[5];
        System.out.println(Arrays.toString(pipeFix(new int[] {1,2,3,5,6,8,9})));
        System.out.println(Arrays.toString(pipeFix(new int[] {-2, 4})));

    }
}
