package codewars.kyu_8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CSV_RepresentationOfArray {
    //https://www.codewars.com/kata/5a34af40e1ce0eb1f5000036/train/java

    public static String toCsvText(int[][] array) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                sb.append(array[i][j]).append(',');
//            }
//            sb.deleteCharAt(sb.length()-1);
//            sb.append("\n");
//        }
//
//        return sb.deleteCharAt(sb.length()-1).toString();

        return Arrays.stream(array).map(r -> Arrays.stream(r).mapToObj(i -> i + "")
                .collect(Collectors.joining(",")))
                .collect(Collectors.joining("\n"));
    }

    public static void main(String[] args) {
        System.out.println(toCsvText(new int[][] {
                { 0, 1, 2, 3, 45 },
                { 10,11,12,13,14 },
                { 20,21,22,23,24 },
                { 30,31,32,33,34 } }));
    }
}
