package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringEvenNumbers {
    /**
     * https://www.codewars.com/kata/566dc566f6ea9a14b500007b/train/java
     */
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
//        List<Integer> result = new ArrayList<>();
//        for (Integer num : listOfNumbers) {
//            if (num % 2 != 0) {
//                result.add(num);
//            }
//        }
//        return result;

        return listOfNumbers.stream().filter(s -> s%2 != 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(filterOddNumber(Arrays.asList(1, 2, 2, 2, 4, 3, 4)));
    }
}
