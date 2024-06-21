package codewars.kyu_8;

import java.util.stream.Stream;

public class CodeChallenge_18 {

    /**
     * https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
     */

    public static int strCount(String str, char letter) {

        return (int)str.chars().filter(x -> x == letter).count();

//        char[] chars = str.toCharArray();
//        int count = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == letter) {
//                count++;
//            }
//        }
//
//        return count;
    }

    public static void main(String[] args) {
        System.out.println(strCount("", 'l'));
    }
}
