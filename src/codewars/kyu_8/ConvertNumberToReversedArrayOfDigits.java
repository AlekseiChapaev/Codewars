package codewars.kyu_8;

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {

    //https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/javav

    public static int[] digitize(long n) {
        char[] arrChar = (String.valueOf(n)).toCharArray();
        int[] arrInt = new int[arrChar.length];

        for (int i = 0; i < arrChar.length; i++) {
            arrInt[i] = arrChar[(arrChar.length - 1) - i] - 48;
        }
        return arrInt;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
    }
}
