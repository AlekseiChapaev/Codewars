package codewars;

public class IsNumberDivisibleByTwoNumbers {

    //https://www.codewars.com/kata/5545f109004975ea66000086/train/java

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    public static void main(String[] args) {

    }
}
