package codewars.kyu_8;

public class ShortLongShort {
    public static String solution(String a, String b) {
        if(a.length() < b.length()) {
            return a.concat(b).concat(a);
        } else return b.concat(a).concat(b);
    }

    public static void main(String[] args) {
        System.out.println(solution("aa", "b"));
    }
}
