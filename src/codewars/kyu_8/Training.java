package codewars.kyu_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Training {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
//        return Stream.of(str.toCharArray()).sorted().toString();
    }

    public static void main(String[] args) {

        System.out.println(solution("worldworld"));
    }

}
