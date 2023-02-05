package codewars;

public class SubtractTheSum {

    //https://www.codewars.com/kata/56c5847f27be2c3db20009c3

    public static String subtractSum (int n) {
        if(n >= 10 && n < 10000){
            char[] arr = String.valueOf(n).toCharArray();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
               count += arr[i];
               if(count > 0 && count < 101){

               }
            }
        }
        return "";

    }

    public static void main(String[] args) {
        System.out.println(subtractSum(9000));
    }
}
