package codewars;

import java.util.Arrays;

public class BarycenterOfTriangle {

    /**
     * https://www.codewars.com/kata/5601c5f6ba804403c7000004/train/java
     *
     * barTriang([4, 6], [12, 4], [10, 10]) ------> {8.6667, 6.6667}
     *
     * barTriang([4, 2], [12, 2], [6, 10] ------> {7.3333, 4.6667}
     */



    public static double[] barTriang(double[] x, double[] y, double[] z){
        double[] result = new double[2];
        result[0] = Math.round((x[0] + y[0] + z[0]) * 10000 / 3);
        result[1] = Math.round((x[1] + y[1] + z[1]) * 10000 / 3);

        result[0] = result[0] / 10000;
        result[1] = result[1] / 10000;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(barTriang(new double[]{4, 6}, new double[]{12, 4}, new double[]{10, 10})));
    }
}
