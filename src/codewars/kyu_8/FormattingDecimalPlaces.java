package codewars.kyu_8;

public class FormattingDecimalPlaces {
    /**
     * https://www.codewars.com/kata/5641a03210e973055a00000d/train/java
     */
    public static double TwoDecimalPlaces(double number) {
        return (Math.round(number*100))/100.0;
    }

    public static void main(String[] args) {
        System.out.println(TwoDecimalPlaces(173735326.3783732637948948));
    }
}
