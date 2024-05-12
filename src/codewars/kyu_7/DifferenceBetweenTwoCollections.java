package codewars.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferenceBetweenTwoCollections {
    //https://www.codewars.com/kata/594093784aafb857f0000122

    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        return Stream.of(a, b).flatMap(Collection::stream).distinct().filter(c -> !a.contains(c) || !b.contains(c))
                .sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(diff(List.of('a', 'b', 'z', 'd', 'e', 'd'), List.of('a', 'b', 'j', 'j')));
    }
}
