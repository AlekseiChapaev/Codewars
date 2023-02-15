package codewars;

public class IsItANumber {
    public static boolean isDigit(String s) {
        return s.matches("-?\\d*\\.?\\d+");
    }

    public static void main(String[] args) {
        System.out.println(isDigit("4.0216218019206723"));
    }
}
