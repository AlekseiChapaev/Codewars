package codewars.kyu_8;

public class SumOfPositive {

    //https://www.codewars.com/kata/5715eaedb436cf5606000381

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, -2, 3, 4, 5}));
    }
}
