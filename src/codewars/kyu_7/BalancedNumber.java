package codewars.kyu_7;

public class BalancedNumber {

    //https://www.codewars.com/kata/5a4e3782880385ba68000018/train/java

    private static int getSumOfDigitsInNumber(int num) {

        return String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

    public static String balancedNum(long number) {
        final int numberOfDigits = String.valueOf(number).length();
        final int firstHalfSum;
        final int secondHalfSum;
        final int firstHalfNumber;
        final int secondHalfNumber;

        if (numberOfDigits < 3) return "Balanced";

        else if (numberOfDigits % 2 != 0) {
            firstHalfNumber = Integer.parseInt(String.valueOf(number).substring(0, numberOfDigits / 2));
            secondHalfNumber = Integer.parseInt(String.valueOf(number).substring(numberOfDigits / 2 + 1));
            firstHalfSum = getSumOfDigitsInNumber(firstHalfNumber);
            secondHalfSum = getSumOfDigitsInNumber(secondHalfNumber);

        } else {
            firstHalfNumber = Integer.parseInt(String.valueOf(number).substring(0, numberOfDigits / 2 - 1));
            secondHalfNumber = Integer.parseInt(String.valueOf(number).substring(numberOfDigits / 2 + 1));
            firstHalfSum = getSumOfDigitsInNumber(firstHalfNumber);
            secondHalfSum = getSumOfDigitsInNumber(secondHalfNumber);
        }

        if (firstHalfSum == secondHalfSum) {
            return "Balanced";
        } else
            return "Not Balanced";
    }

    public static void main(String[] args) {
        System.out.println(balancedNum(56239814));
    }
}
