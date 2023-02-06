package codewars;

public class SaleHotdogs {
    public static int saleHotdogs(final int n) {
        if (n < 5) {
            return 100 * n;
        } else if (n < 10) {
            return 95 * n;
        } else return 90 * n;
    }

    public static void main(String[] args) {
        System.out.println(saleHotdogs(5));
    }
}
