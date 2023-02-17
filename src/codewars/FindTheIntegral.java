package codewars;

public class FindTheIntegral {
    /**
     * https://www.codewars.com/kata/59811fd8a070625d4c000013/train/java
     */
    public static String integrate(int coefficient, int exponent) {
        return (coefficient / (exponent + 1)) + "x^" + (exponent + 1);
    }

    public static void main(String[] args) {
        System.out.println(integrate(12,5));
    }
}
