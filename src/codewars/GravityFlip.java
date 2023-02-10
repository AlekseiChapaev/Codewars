package codewars;

import java.util.*;
import java.util.stream.IntStream;

public class GravityFlip {
    /**
     * https://www.codewars.com/kata/5f70c883e10f9e0001c89673/train/java
     */
    public static int[] flip(char dir, int[] arr) {
        if(dir == 'R'){
            Arrays.sort(arr);

            return arr;
        } else{
            Integer[] integerArray = IntStream.of(arr).boxed().toArray(Integer []::new);
            Arrays.sort(integerArray, Collections.reverseOrder());
            int result [] = Arrays.stream(integerArray).mapToInt(i->i).toArray();

            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(flip('L', new int[]{ 5,5,4,3,1 })));
    }
}
