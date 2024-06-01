package codewars.kyu_7;

import java.util.List;
import java.util.stream.Collectors;

public class OnesAndZeros {

    //https://www.codewars.com/kata/578553c3a1b8d5c40300037c

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(binary.stream().map(String::valueOf).collect(Collectors.joining()), 2);
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(List.of(1,1,1,1)));
    }
}
