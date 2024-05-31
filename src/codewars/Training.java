package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Training {

    public static int sum(List<?> mixed) {
        return mixed.stream()
                .mapToInt(o -> Integer.parseInt(o.toString()))
                .sum();

    }

    public static void main(String[] args) {
        System.out.println(sum(List.of(2, "3", "4", 6)));

        List<?> l = List.of(2, "3", "4", 6);

    }

}
