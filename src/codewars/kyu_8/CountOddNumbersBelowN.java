package codewars.kyu_8;

public class CountOddNumbersBelowN {
    public static int oddCount(int n) {
//        int res = 0;
//        for (int i = 0; i < n; i++) {
//            if(i % 2 != 0) {
//                res++;
//            }
//        }
//        return res;

        return n / 2;
    }

    public static void main(String[] args) {
        System.out.println(oddCount(5));
    }
}
