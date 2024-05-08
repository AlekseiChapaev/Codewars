package codewars.kyu_8;

public class MultiplyTheNumber {
    public static int multiply(int number) {
//        return number * (int)Math.pow(5, String.valueOf(number).replaceAll("\\D", "").length());
        return number * (int)Math.pow(5, String.valueOf(Math.abs(number)).length());
    }

    public static void main(String[] args) {
        System.out.println(multiply(-3));
    }
}
