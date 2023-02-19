package codewars.kyu_8;

import java.util.Arrays;

public class ToSquare_RootOrNotToSquare_Root {

    //https://www.codewars.com/kata/57f6ad55cca6e045d2000627/train/java

    public static int[] squareOrSquareRoot(int[] array){

            int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(Math.sqrt(array[i]) % 1 == 0){
                arr[i] = (int)(Math.sqrt(array[i]));
            } else {
                arr[i] = (int)(Math.pow(array[i], 2));
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{4, 2, 9, 25, 8})));

    }

}
