package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Training {

    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args)
                .min()
                .getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[] {1, 2, -4}));
    }

}
