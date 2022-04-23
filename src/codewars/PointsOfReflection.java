package codewars;

import java.util.Arrays;

public class PointsOfReflection {

   // https://www.codewars.com/kata/57bfea4cb19505912900012c/train/java

    public static int[] reflectPoint(int[] p, int[] q) {
        int[] p1 = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            p1[i] = (q[i] - p[i]) + q[i];
        }
        return p1;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reflectPoint(new int[]{2, 6}, new int[]{-2, -6})));

    }
}
