package codewars.kyu_7;

public class SimpleBeadsCount {
    //https://www.codewars.com/kata/58712dfa5c538b6fc7000569/train/java

    public static int countRedBeads(final int nBlue) {
        return nBlue > 2 ? (nBlue - 1) * 2 : 0;
    }

    public static void main(String[] args) {
        System.out.println(countRedBeads(4));
    }
}
