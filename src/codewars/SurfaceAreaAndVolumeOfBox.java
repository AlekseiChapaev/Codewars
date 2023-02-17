package codewars;

import java.util.Arrays;

public class SurfaceAreaAndVolumeOfBox {
    /**
     * https://www.codewars.com/kata/565f5825379664a26b00007c/train/java
     */
    public static int[] getSize(int w,int h,int d) {
        int[] res = new int[2];
        res[0] = 2 * ((w * h) + (w * d) + (h * d));
        res[1] = w * h * d;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSize(10, 10, 10)));
    }
}
