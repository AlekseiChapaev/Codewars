package codewars.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramDetection {
    // https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

    public static boolean isAnagram(String test, String original) {
        return Arrays.stream(test.toLowerCase().split("")).sorted().collect(Collectors.joining(""))
                .equals(Arrays.stream(original.toLowerCase().split("")).sorted().collect(Collectors.joining("")));
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Buckethead", "DeathCubeK"));
    }
}
