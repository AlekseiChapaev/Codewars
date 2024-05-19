package codewars.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortTheGiftCode {

    //https://www.codewars.com/kata/52aeb2f3ad0e952f560005d3/train/java

    public static String sortGiftCode(String code) {

//        return code.chars()
//                .sorted()
//                .mapToObj(c -> String.valueOf((char) c))
//                .collect(Collectors.joining());

//        return code.chars()
//                .sorted()
//                .mapToObj(Character::toString)
//                .collect(Collectors.joining());

        return Arrays.stream(code.split("")).sorted().collect(Collectors.joining(""));

    }

    public static void main(String[] args) {
        System.out.println(sortGiftCode("fedcba"));
    }
}
