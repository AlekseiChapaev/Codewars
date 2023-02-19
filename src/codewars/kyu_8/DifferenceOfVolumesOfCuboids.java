package codewars.kyu_8;

public class DifferenceOfVolumesOfCuboids {

    //https://www.codewars.com/kata/58cb43f4256836ed95000f97

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

        int vol1 = 1;
        int vol2 = 1;
        for (int i = 0; i < firstCuboid.length; i++) {
            vol1 *= firstCuboid[i];
        }
        for (int i = 0; i < secondCuboid.length; i++) {
            vol2 *= secondCuboid[i];
        }

        return Math.abs(vol1 - vol2);
    }

    public static void main(String[] args) {

        System.out.println(findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));

    }
}
