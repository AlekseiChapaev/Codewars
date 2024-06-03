package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Training {

    public static List<String> sort(List<String> textbooks) {

        return textbooks.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(sort(List.of("Algebra", "history", "english", "Geometry", "History")));
    }

}
