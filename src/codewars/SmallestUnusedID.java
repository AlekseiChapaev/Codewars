package codewars;

import java.util.Arrays;

public class SmallestUnusedID {
    /**
     * https://www.codewars.com/kata/55eea63119278d571d00006a/train/java
     */

    public static int nextId(int[] ids) {

        int[] array = Arrays.stream(ids).distinct().sorted().toArray();
        for(int i = 0; i < array.length; i++){
            if(array[i] != i){
                return i;
            }
        }
        return array.length;
    }
       public static void main(String[] args) {
        System.out.println(nextId(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

    }
}
