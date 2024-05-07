package codewars.kyu_8;

import java.util.Arrays;

public class Training {

    public static String well(String[] x) {
        long count = Arrays.stream(x).filter(s -> s.equals("good")).count();

        if (count == 0) return "Fail!";
        if (count > 2) {
            return "I smell a series!";
        } else {
            return "Publish!";
        }
    }

    public static void main(String[] args) {

        System.out.println(well(new String[]{"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }

}
