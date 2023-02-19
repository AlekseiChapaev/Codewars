package codewars.kyu_8;

public class NoZerosForHeros {
    /**
     * https://www.codewars.com/kata/570a6a46455d08ff8d001002/train/java
     */

    public static int noBoringZeros(int n) {
        if (n == 0)
            return n;
        while (n % 10 == 0) {
            n = n / 10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(noBoringZeros(960010000));
    }
}
