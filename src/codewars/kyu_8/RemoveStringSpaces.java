package codewars.kyu_8;

public class RemoveStringSpaces {

    //https://www.codewars.com/kata/57eae20f5500ad98e50002c5

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    }
}
