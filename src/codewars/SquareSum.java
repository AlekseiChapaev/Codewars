package codewars;

public class SquareSum {

    //https://www.codewars.com/kata/515e271a311df0350d00000f

    public static int squareSum(int[] n){
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result += Math.pow(n[i], 2);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
    }
}
