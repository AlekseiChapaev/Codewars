package codewars.kyu_7;

public class StringEndsWith {
    /**
     * https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java
     */
    public static boolean solution(String str, String ending) {

        return str.endsWith(ending);
    }

    public static void main(String[] args) {
        System.out.println(solution("this", "is"));
    }
}
