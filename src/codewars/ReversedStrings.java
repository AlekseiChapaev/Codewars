package codewars;

public class ReversedStrings {

    //https://www.codewars.com/kata/5168bb5dfe9a00b126000018

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Hello"));

    }
}
