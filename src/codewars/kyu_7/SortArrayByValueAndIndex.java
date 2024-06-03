package codewars.kyu_7;

import java.util.*;

public class SortArrayByValueAndIndex {

    //https://www.codewars.com/kata/58e0cb3634a3027180000040/train/java

    public static int[] sortByValueAndIndex(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>(); // we create Map, where we input as a key values array[i] * (i + 1)
                                                            // and as a values their number of order in array
        for (int i = 0; i < array.length; i++) {
            map.put(array[i] * (i + 1), array[i]);
        }

        Map<Integer, Integer> res = new TreeMap<>(map); // here we sort Map by keys

        return res.values().stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByValueAndIndex(new int[] { 23, 2, 3, 4, 5 })));
    }
}
