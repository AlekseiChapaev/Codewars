package codewars.kyu_8;

import java.util.Arrays;

public class CatYearsDogYears {

    //https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int[] arr = new int[3];
        arr[0] = humanYears;

        if(humanYears == 1){
            arr[1] = 15;
        }
        if(humanYears == 2){
            arr[1] = 15 + 9;
        }
        if(humanYears > 2){
            int temp = humanYears - 2;
            arr[1] = (temp * 4) + 15 + 9;
        }

        if(humanYears == 1){
            arr[2] = 15;
        }
        if(humanYears == 2){
            arr[2] = 15 + 9;
        }
        if(humanYears > 2){
            int temp = humanYears - 2;
            arr[2] = (temp * 5) + 15 + 9;
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2)));

    }
}
