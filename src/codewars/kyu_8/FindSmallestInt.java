package codewars.kyu_8;

import java.util.stream.IntStream;

public class FindSmallestInt {

    //https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java

    public static int findSmallestInt(int[] args) {
        return IntStream.of(args)
                .min()
                .getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[] {1, 2, -4}));
    }
}
