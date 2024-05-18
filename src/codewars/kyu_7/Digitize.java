package codewars.kyu_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Digitize {

    //https://www.codewars.com/kata/5417423f9e2e6c2f040002ae

    public static int[] digitize(int n){
        return String.valueOf(n)
                .chars()
                .map(c -> Character.getNumericValue(c))
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(12432)));
    }
}
