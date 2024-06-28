package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Training {

    public static int strCount(String str, char letter) {
        int count = 0;
        for(char c: str.toCharArray()) {
            if(c == letter) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'w'));
    }
}
