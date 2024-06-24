package codewars.kyu_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingElements {

    //https://www.codewars.com/kata/5769b3802ae6f8e4890009d2/train/java

    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            res.add(arr[i]);
        }
        return res.toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello Again"})));
    }
}
