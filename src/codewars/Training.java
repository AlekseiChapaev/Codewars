package codewars;

import java.util.Arrays;
import java.util.Collections;

public class Training {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 0, 2, 4};

        Arrays.sort(arr);
        int[] sortedArray = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortedArray));

    }

}
