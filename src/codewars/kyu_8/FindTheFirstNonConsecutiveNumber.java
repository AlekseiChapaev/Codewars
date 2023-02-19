package codewars.kyu_8;

public class FindTheFirstNonConsecutiveNumber {

    //https://www.codewars.com/kata/58f8a3a27a5c28d92e000144

    static Integer find(final int[] array) {

        for (int i = 1; i < array.length; i++) {
            if(array[i] - array[i - 1] != 1){
                return array[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3}));
    }
}
