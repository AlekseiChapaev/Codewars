package codewars.kyu_8;

import java.util.Arrays;

public class Reflections {
    //https://www.codewars.com/kata/57bfea4cb19505912900012c/train/java

    public static int[] reflectPoint(int[] p, int[] q) {

        return new int[]{q[0] + (q[0] - p[0]), q[1] + (q[1] - p[1])};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reflectPoint(new int[]{2,6}, new int[]{-2,-6})));
    }
}
